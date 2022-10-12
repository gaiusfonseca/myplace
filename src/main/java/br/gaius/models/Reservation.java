package br.gaius.models;

import java.time.LocalDateTime;

public class Reservation {

	private long userId;
	private String workstationId;
	private LocalDateTime start;
	private LocalDateTime finish;
	
	public Reservation() {
		
	}
	
	public Reservation(long userId, String workstationId, LocalDateTime start, LocalDateTime finish) {
		this.userId = userId;
		this.workstationId = workstationId;
		this.start = start;
		this.finish = finish;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getWorkstationId() {
		return workstationId;
	}

	public void setWorkstationId(String workstationId) {
		this.workstationId = workstationId;
	}

	public LocalDateTime getStart() {
		return start;
	}

	public void setStart(LocalDateTime start) {
		this.start = start;
	}

	public LocalDateTime getFinish() {
		return finish;
	}

	public void setFinish(LocalDateTime finish) {
		this.finish = finish;
	}
}
