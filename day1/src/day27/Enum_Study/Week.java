package day27.Enum_Study;

/**
 * 枚举1
 */
public class Week {

	public static final Week MON = new Week();
	public static final Week TUE = new Week();
	public static final Week WED = new Week();

	private Week(){}						//私有构造,不让其他类创建本类对象
}
