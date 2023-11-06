import java.util.ArrayList;
import java.util.List;

public class ShapeUtil {

    /**
     * Prints information about a list of geometric objects.
     * @param shapes the list of geometric objects
     * @return a string containing the information about the geometric objects
     */
    public static String printInfo(List<GeometricObject> shapes) {
        StringBuilder info = new StringBuilder();
        List<String> circleInfo = new ArrayList<>();
        List<String> triangleInfo = new ArrayList<>();
        for (GeometricObject shape : shapes) {
            if (shape instanceof Circle) {
                circleInfo.add(shape.getInfo());
            } else if (shape instanceof Triangle) {
                triangleInfo.add(shape.getInfo());
            }
        }
        if (!circleInfo.isEmpty()) {
            info.append("Circle:\n");
            for (String s : circleInfo) {
                info.append(s).append("\n");
            }
        }
        if (!triangleInfo.isEmpty()) {
            info.append("Triangle:\n");
            for (String s : triangleInfo) {
                info.append(s).append("\n");
            }
        }
        return info.toString();
    }
}
