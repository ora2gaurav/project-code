import java.math.BigDecimal;

public class CheckBigDecoma {

	
	
	public static void main(String[] args) {
		BigDecimal dd=BigDecimal.valueOf(Double.valueOf("45221.91948294829"));
		System.out.println(dd.setScale(2,BigDecimal.ROUND_FLOOR));
	}
}
