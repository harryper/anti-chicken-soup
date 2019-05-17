package top.harryper.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "anti_chicken_soup", schema = "assets")
public class AntiChickenSoup {
	
	private Integer ascId;
	private String ascContent;
	private Integer ascLike;
	private Integer ascDislike;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "acs_id")
	public Integer getAscId() {
		return ascId;
	}
	public void setAscId(Integer ascId) {
		this.ascId = ascId;
	}
	@Column(name = "asc_content")
	public String getAscContent() {
		return ascContent;
	}
	public void setAscContent(String ascContent) {
		this.ascContent = ascContent;
	}
	@Column(name = "asc_like")
	public Integer getAscLike() {
		return ascLike;
	}
	public void setAscLike(Integer ascLike) {
		this.ascLike = ascLike;
	}
	@Column(name = "asc_dislike")
	public Integer getAscDislike() {
		return ascDislike;
	}
	public void setAscDislike(Integer ascDislike) {
		this.ascDislike = ascDislike;
	}
}
