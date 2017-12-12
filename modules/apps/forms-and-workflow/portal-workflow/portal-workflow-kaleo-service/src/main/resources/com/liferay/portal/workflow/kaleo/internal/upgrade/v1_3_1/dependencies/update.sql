alter table KaleoNotification add kaleoClassName VARCHAR(200) null;
alter table KaleoNotification add kaleoClassPK LONG;

drop table KaleoTaskForm;

create table KaleoTaskForm (
	kaleoTaskFormId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName STRING,
	createDate DATE null,
	modifiedDate DATE null,
	kaleoNodeId LONG,
	kaleoTaskId LONG,
	kaleoTaskName VARCHAR(200),
	name VARCHAR(200) null,
	description TEXT null,
	formCompanyId LONG,
	formDefinition TEXT null, 
	formGroupId LONG, 
	formId LONG,
	formUuid STRING,
	metadata TEXT null,
	priority INTEGER
);

drop table KaleoTaskFormInstance;

create table KaleoTaskFormInstance (
	kaleoTaskFormInstanceId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName STRING,
	createDate DATE null,
	modifiedDate DATE null,
	kaleoInstanceId LONG,
	kaleoTaskId LONG,
	kaleoTaskInstanceTokenId LONG,
	kaleoTaskFormId LONG,
	formValues TEXT null,
	formValueEntryGroupId LONG,
	formValueEntryId LONG,
	formValueEntryUuid STRING,
	metadata TEXT null
);

COMMIT_TRANSACTION;