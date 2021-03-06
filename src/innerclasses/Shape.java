/**
 * 
 */
package innerclasses;

/**
 * @author vgoyal
 *
 */
public abstract class Shape {
	
	public static class Color {
		
		private int m_red, m_green, m_blue;
		
		public Color() {
			this(0,0,0);
		}
		
		public Color(int red, int green, int blue) {
			m_red = red;
			m_green = green;
			m_blue = blue;
		}
		
		@Override
		public String toString() {
			return "m_red : " + m_red + ", m_green" + m_green + ", m_blue : " + m_blue;
		}
	}
}
