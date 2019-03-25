package ${configYAML.apiPackagePath}.client.json;

import javax.annotation.Generated;

/**
 * @author ${configYAML.author}
 * @generated
 */
@Generated("")
public abstract class BaseJSONParser {

	public T parseToDTO(String string) {
		if (string == null) {
			throw new IllegalArgumentException("Expected non null");
		}

		_initFields(string);

		_assertStartsAndEndsWith("{", "}");

		T dto = createDTO();

		if (_isEmpty()) {
			return dto;
		}

		_readNextChar();

		_readWhileLastCharIsWhiteSpace();

		_readNextChar();

		if (_isLastChar('}')) {
			_readWhileLastCharIsWhiteSpace();

			if (!_isEndOfText()) {
				_readNextChar();

				throw new IllegalArgumentException(
					"Expected end of JSON; got '" + lastChar + "'");
			}

			return dto;
		}

		do {
			_readWhileLastCharIsWhiteSpace();

			String fieldName = _readString();

			_readWhileLastCharIsWhiteSpace();

			_assertLastChar(':');

			_readNextChar();

			_readWhileLastCharIsWhiteSpace();

			setField(dto, fieldName, _readValue());

			_readWhileLastCharIsWhiteSpace();
		}
		while (_ifLastCharMatchesThenRead(','));

		return dto;
	}

	public T[] parseToDTOs(String string) {
		if (string == null) {
			throw new IllegalArgumentException("Expected non null");
		}

		_initFields(string);

		_assertStartsAndEndsWith("[", "]");

		if (_isEmpty()) {
			return createDTOs();
		}

		_readNextChar();

		_readWhileLastCharIsWhiteSpace();

		if (_isLastChar(']')) {
			_readNextChar();

			return createDTOs();
		}

		_readWhileLastCharIsWhiteSpace();

		return arrayOfObjectsToArrayOfDTOs((Object[])_readValue());
	}

	protected static Integer[] arrayOfObjectsToArrayOfIntegers(
		Object[] objects) {

		return Stream.of(
			objects
		).map(
			object -> {
				try {
					return Integer.parseInt(object.toString());
				}
				catch (NumberFormatException nfe) {
					throw new RuntimeException(nfe);
				}
			}
		).toArray(
			size -> new Integer[size]
		);
	}

	protected static Long[] arrayOfObjectsToArrayOfLongs(Object[] objects) {
		return Stream.of(
			objects
		).map(
			object -> {
				try {
					return Long.parseLong(object.toString());
				}
				catch (NumberFormatException nfe) {
					throw new RuntimeException(nfe);
				}
			}
		).toArray(
			size -> new Long[size]
		);
	}

	protected static String[] arrayOfObjectsToArrayOfStrings(Object[] objects) {
		return Stream.of(
			objects
		).map(
			String.class::cast
		).toArray(
			size -> new String[size]
		);
	}

	protected Date[] arrayOfObjectsToArrayOfDates(Object[] objects) {
		return Stream.of(
			objects
		).map(
			object -> {
				try {
					return dateFormat.parse((String)object);
				}
				catch (ParseException pe) {
					throw new IllegalArgumentException(
						"Could not parse date from value " + object, pe);
				}
			}
		).toArray(
			size -> new Date[size]
		);
	}

	protected abstract T[] arrayOfObjectsToArrayOfDTOs(Object[] objects);

	protected abstract T createDTO();

	protected abstract T[] createDTOs();

	private void _initFields(String string) {
		captureStartStack = new Stack<>();
		dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
		index = 0;
		jsonString = string.trim();
		lastChar = 0;
	}

	private void _readNextChar() {
		if (!_isEndOfText()) {
			lastChar = jsonString.charAt(index++);
		}
	}

	private Object _readValue() {
		if (lastChar == 'f') {
			return _readFalseAsBoolean();
		}
		else if (lastChar == 'n') {
			return _readNullAsObject();
		}
		else if ((lastChar == '-') || (lastChar == '0') || (lastChar == '1') ||
				 (lastChar == '2') || (lastChar == '3') || (lastChar == '4') ||
				 (lastChar == '5') || (lastChar == '6') || (lastChar == '7') ||
				 (lastChar == '8') || (lastChar == '9')) {

			return _readNumberAsString();
		}
		else if (lastChar == '"') {
			return _readString();
		}
		else if (lastChar == 't') {
			return _readTrueAsBoolean();
		}
		else if (lastChar == '[') {
			return _readArrayAsArrayOfObjects();
		}
		else if (lastChar == '{') {
			return _readObjectAsJsonString();
		}
		else {
			throw new IllegalArgumentException();
		}
	}

	protected abstract void setField(T dto, String fieldName, Object object);

	protected static DateFormat dateFormat;

	protected Stack<Integer> captureStartStack;
	protected int index;
	protected String jsonString;
	protected char lastChar;

	private void _assertLastChar(char ch) {
		if (lastChar != ch) {
			throw new IllegalArgumentException(
				String.format("Expected '%s'; got '%s'", ch, lastChar));
		}
	}

	private void _assertStartsAndEndsWith(String prefix, String sufix) {
		if (!jsonString.startsWith(prefix)) {
			throw new IllegalArgumentException(
				String.format(
					"Expected '%s'; got '%s'", prefix, jsonString.charAt(0)));
		}

		if (!jsonString.endsWith(sufix)) {
			throw new IllegalArgumentException(
				String.format(
					"Expected '%s'; got '%s'", sufix,
					jsonString.charAt(jsonString.length() - 1)));
		}
	}

	private String _getCapturedSubstring() {
		return jsonString.substring(captureStartStack.pop(), index - 1);
	}

	private boolean _ifLastCharMatchesThenRead(char ch) {
		if (lastChar != ch) {
			return false;
		}

		_readNextChar();

		return true;
	}

	private boolean _isEmpty() {
		String substring = jsonString.substring(1, jsonString.length() - 1);

		String substringTrimmed = substring.trim();

		return substringTrimmed.isEmpty();
	}

	private boolean _isEndOfText() {
		if (index == jsonString.length()) {
			return true;
		}

		return false;
	}

	private boolean _isLastChar(char ch) {
		if (lastChar == ch) {
			return true;
		}

		return false;
	}

	private boolean _isLastCharDigit() {
		if ((lastChar >= '0') && (lastChar <= '9')) {
			return true;
		}

		return false;
	}

	private Object[] _readArrayAsArrayOfObjects() {
		List<Object> objects = new ArrayList<>();

		_readNextChar();

		_readWhileLastCharIsWhiteSpace();

		if (_isLastChar(']')) {
			_readNextChar();

			return objects.toArray();
		}

		do {
			_readWhileLastCharIsWhiteSpace();
			objects.add(_readValue());
			_readWhileLastCharIsWhiteSpace();
		}
		while (_ifLastCharMatchesThenRead(','));

		if (!_isLastChar(']')) {
			throw new IllegalArgumentException(
				"Expected ']'; got '" + lastChar + "'");
		}

		_readNextChar();

		return objects.toArray();
	}

	private boolean _readFalseAsBoolean() {
		_readNextChar();
		_assertLastChar('a');
		_readNextChar();
		_assertLastChar('l');
		_readNextChar();
		_assertLastChar('s');
		_readNextChar();
		_assertLastChar('e');
		_readNextChar();

		return false;
	}

	private Object _readNullAsObject() {
		_readNextChar();
		_assertLastChar('u');
		_readNextChar();
		_assertLastChar('l');
		_readNextChar();
		_assertLastChar('l');
		_readNextChar();

		return null;
	}

	private String _readNumberAsString() {
		_setCaptureStart();

		do {
			_readNextChar();
		}
		while (_isLastCharDigit());

		return _getCapturedSubstring();
	}

	private String _readObjectAsJsonString() {
		_setCaptureStart();
		_readNextChar();
		_readWhileLastCharIsWhiteSpace();

		if (_isLastChar('}')) {
			_readNextChar();

			return "{}";
		}

		do {
			_readWhileLastCharIsWhiteSpace();
			_readString();
			_readWhileLastCharIsWhiteSpace();

			if (!_ifLastCharMatchesThenRead(':')) {
				throw new IllegalArgumentException("Expected ':'");
			}

			_readWhileLastCharIsWhiteSpace();
			_readValue();
			_readWhileLastCharIsWhiteSpace();
		}
		while (_ifLastCharMatchesThenRead(','));

		_readWhileLastCharIsWhiteSpace();

		if (!_ifLastCharMatchesThenRead('}')) {
			throw new IllegalArgumentException(
				"Expected either ',' or '}'; found '" + lastChar + "'");
		}

		return _getCapturedSubstring();
	}

	private String _readString() {
		_readNextChar();
		_setCaptureStart();

		while (lastChar != '"') {
			_readNextChar();
		}

		String string = _getCapturedSubstring();

		_readNextChar();

		return string;
	}

	private boolean _readTrueAsBoolean() {
		_readNextChar();
		_assertLastChar('r');
		_readNextChar();
		_assertLastChar('u');
		_readNextChar();
		_assertLastChar('e');
		_readNextChar();

		return true;
	}

	private void _readWhileLastCharIsWhiteSpace() {
		while ((lastChar == ' ') || (lastChar == '\t') || (lastChar == '\n') ||
			   (lastChar == '\r')) {

			_readNextChar();
		}
	}

	private void _setCaptureStart() {
		captureStartStack.push(index - 1);
	}

}