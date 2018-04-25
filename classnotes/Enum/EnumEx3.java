import java.lang.*;
class EnumEx3{
	public static void main(String[] args) {
		//printing one of constant
		System.out.println(UserStatus.Active);
		for ( UserStatus arr : UserStatus.values()){
			System.out.println(arr);
		}
		UserStatus status = UserStatus.Pending;
		if ( status != UserStatus.Deactive){
			System.out.println("status is not Deactive");
		}
	}
}
enum UserStatus{
	Active,Pending,Deactive;
}