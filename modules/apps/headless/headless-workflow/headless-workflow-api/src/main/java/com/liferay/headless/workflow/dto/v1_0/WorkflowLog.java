/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.headless.workflow.dto.v1_0;

import java.util.Date;
import java.util.function.Supplier;

import javax.annotation.Generated;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
@XmlRootElement(name = "WorkflowLog")
public class WorkflowLog {

	public String getAuditPerson() {
		return _auditPerson;
	}

	public String getCommentLog() {
		return _commentLog;
	}

	public Date getDateCreated() {
		return _dateCreated;
	}

	public Long getId() {
		return _id;
	}

	public String getPerson() {
		return _person;
	}

	public String getPreviousPerson() {
		return _previousPerson;
	}

	public String getPreviousState() {
		return _previousState;
	}

	public String getState() {
		return _state;
	}

	public WorkflowTask getTask() {
		return _task;
	}

	public Long getTaskId() {
		return _taskId;
	}

	public String getType() {
		return _type;
	}

	public void setAuditPerson(String auditPerson) {
		_auditPerson = auditPerson;
	}

	public void setAuditPerson(Supplier<String> auditPersonSupplier) {
		_auditPerson = auditPersonSupplier.get();
	}

	public void setCommentLog(String commentLog) {
		_commentLog = commentLog;
	}

	public void setCommentLog(Supplier<String> commentLogSupplier) {
		_commentLog = commentLogSupplier.get();
	}

	public void setDateCreated(Date dateCreated) {
		_dateCreated = dateCreated;
	}

	public void setDateCreated(Supplier<Date> dateCreatedSupplier) {
		_dateCreated = dateCreatedSupplier.get();
	}

	public void setId(Long id) {
		_id = id;
	}

	public void setId(Supplier<Long> idSupplier) {
		_id = idSupplier.get();
	}

	public void setPerson(String person) {
		_person = person;
	}

	public void setPerson(Supplier<String> personSupplier) {
		_person = personSupplier.get();
	}

	public void setPreviousPerson(String previousPerson) {
		_previousPerson = previousPerson;
	}

	public void setPreviousPerson(Supplier<String> previousPersonSupplier) {
		_previousPerson = previousPersonSupplier.get();
	}

	public void setPreviousState(String previousState) {
		_previousState = previousState;
	}

	public void setPreviousState(Supplier<String> previousStateSupplier) {
		_previousState = previousStateSupplier.get();
	}

	public void setState(String state) {
		_state = state;
	}

	public void setState(Supplier<String> stateSupplier) {
		_state = stateSupplier.get();
	}

	public void setTask(Supplier<WorkflowTask> taskSupplier) {
		_task = taskSupplier.get();
	}

	public void setTask(WorkflowTask task) {
		_task = task;
	}

	public void setTaskId(Long taskId) {
		_taskId = taskId;
	}

	public void setTaskId(Supplier<Long> taskIdSupplier) {
		_taskId = taskIdSupplier.get();
	}

	public void setType(String type) {
		_type = type;
	}

	public void setType(Supplier<String> typeSupplier) {
		_type = typeSupplier.get();
	}

	private String _auditPerson;
	private String _commentLog;
	private Date _dateCreated;
	private Long _id;
	private String _person;
	private String _previousPerson;
	private String _previousState;
	private String _state;
	private WorkflowTask _task;
	private Long _taskId;
	private String _type;

}