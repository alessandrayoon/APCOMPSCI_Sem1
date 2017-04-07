import java.lang.Math.*;
import java.util.ArrayList;
import java.util.Arrays;
public class toyota2 extends car2
{
	private double xx, yy;

	public toyota2(String meghan)
	{
		super();
		ArrayList<String> position = new ArrayList<>(Arrays.asList(meghan.split(", ")));
		Double meghanX = Double.parseDouble(position.get(0));
		Double meghanY = Double.parseDouble(position.get(1));
		move(meghanX, meghanY);
	}
}