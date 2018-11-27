window.Liferay = {
	Language: {
		get: key => key
	},
	ThemeDisplay: {
		getLanguageId: () => 'en_US'
	}
};

window.AUI = () => (
	{
		use: (_, callback) => callback(
			{
				LiferayAlloyEditor: () => (
					{
						render: () => (
							{
								getHTML: () => 'test'
							}
						)
					}
				),
				one: () => (
					{
						innerHTML: () => {}
					}
				)
			}
		)
	}
);

window.AlloyEditor = {
	Selections: []
};

window.themeDisplay = window.Liferay.ThemeDisplay;