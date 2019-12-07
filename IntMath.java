
package pgdp.color;
/**
* Vorgegebene Klasse, hier drin wird nichts bewertet !!!
* &lt;p&gt;
* Bitte nicht verändern !!
*/
public class IntMath {
private IntMath() {
}
public static int powerOfTwo(int exponent) {
if (exponent &gt; 31)
ExceptionUtil.unsupportedOperation(&quot;exponent too large: &quot; + exponent);
if (exponent &lt; 0)
ExceptionUtil.unsupportedOperation(&quot;exponent cannot be negative: &quot; +
exponent);
return 1 &lt;&lt; exponent;
}
}