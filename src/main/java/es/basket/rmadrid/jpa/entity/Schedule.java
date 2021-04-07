package es.basket.rmadrid.jpa.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "schedule")
@EntityListeners(AuditingEntityListener.class)
public class Schedule extends BaseEntity {

	private String local;
	private String visitor;
	private String court;
	
	@ManyToOne
	@JoinColumn(name = "tournament_id")
	private Tournaments tournament;
	
	private Date date;

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getVisitor() {
		return visitor;
	}

	public void setVisitor(String visitor) {
		this.visitor = visitor;
	}

	public String getCourt() {
		return court;
	}

	public void setCourt(String court) {
		this.court = court;
	}

	public Tournaments getTournament() {
		return tournament;
	}

	public void setTournament(Tournaments tournament) {
		this.tournament = tournament;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Schedule [" + (local != null ? "local=" + local + ", " : "")
				+ (visitor != null ? "visitor=" + visitor + ", " : "") + (court != null ? "court=" + court + ", " : "")
				+ (tournament != null ? "tournament=" + tournament + ", " : "")
				+ (date != null ? "date=" + date + ", " : "") + "id=" + id + ", "
				+ (updated != null ? "updated=" + updated : "") + "]";
	}
}
