package POJOClassesLayer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder=true)
public class EmployeePojo {

	private String fname;
	private String lname;
	private String mobileNo;
	private String address;
	private String emailID;

}
