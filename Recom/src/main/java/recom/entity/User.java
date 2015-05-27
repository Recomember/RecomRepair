package recom.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author andoharuka
 * userテーブルのエンティティ
 */
@Entity
@Table(name = "user")
public class User {

	@Id
	@Column(name = "user_ID", nullable = false)
	public String userId;
	
	@Column(name = "user_pass", nullable = false)
	public String userPass;
	
}
