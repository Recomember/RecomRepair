package recom.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author andoharuka
 * Recomemberテーブルのエンティティ
 */
@Entity
@Table(name = "recomember")
public class Recomember {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "recom_ID" , precision = 20, nullable = false)
	public Integer recomId;
	
	@Column(name = "recom_name", nullable = false)
	public String empName;
	
	@Column(name ="phone")
	public String empPhone;
	
	@Column(name="BirthYear")
	public String birthYear;
	
	@Column(name="BirthMonth")
	public String birthMonth;
	
	@Column(name="BirthDay")
	public String birthDay;
	
	@Column(name = "note")
	public String empNote;
	
	@Column(name = "talk_flag")
	public Integer talkFlag;
	
	@Column(name = "delete_flag")
	public Integer deleteFlag;
	
   @Temporal(TemporalType.TIMESTAMP)
	@Column(name = "registration_date")
	public Date registrationDate;
	
   @Temporal(TemporalType.TIMESTAMP)
	@Column(name = "update_date")
	public Date updateDate;
   
    @Column(name = "favFood")
    public String favFood;
   
		
}
