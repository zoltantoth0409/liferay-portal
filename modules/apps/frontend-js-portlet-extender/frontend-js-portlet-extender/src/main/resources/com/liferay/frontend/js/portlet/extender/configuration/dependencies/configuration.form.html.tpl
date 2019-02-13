<form
	action="[$ACTION_URL$]"
	class="form container container-no-gutters-sm-down container-view"
	data-fm-namespace="[$PORTLET_NAME$]"
	id="[$PORTLET_NAME$]fm"
	method="post"
	name="[$PORTLET_NAME$]"
>
	<input class="field form-control" id="[$PORTLET_NAME$][$CONSTANTS_CMD$]" name="[$PORTLET_NAME$][$CONSTANTS_CMD$]" type="hidden" value="[$CONSTANTS_UPDATE$]" />
	<input class="field form-control" id="[$PORTLET_NAME$]configurationObject" name="[$PORTLET_NAME$]configurationObject" type="hidden" value=""[$FIELDS_JSON_ARRAY$]"" />
	<input class="field form-control" id="[$PORTLET_NAME$]formDate" name="[$PORTLET_NAME$]formDate" type="hidden" value="[$CURRENT_TIME_MILLIS$]" />

	<div class="lfr-form-content" id="portlet-configuration">
		<div class="sheet sheet-lg" id="sheet-portlet">
			<div aria-multiselectable="true" class="panel-group" role="tablist">
				[$DDM_FORM_HTML$]
			</div>
		</div>
	</div>

	<div class="button-holder dialog-footer">
		<button class="btn btn-default btn-primary" id="form-button-submit" type="submit">
			<span class="lfr-btn-label">
				[$SAVE_LABEL$]
			</span>
		</button>
	</div>
</form>