package creational.factory.a3_shape;

import creational.builder.a1_hoadon.HoaDon;

public class Circle extends Shape{

    @Override
    public String draw() {
        stringBuilder.append(brush)
                .append("\n")
                .append(paper)
                .append("\n")
                .append(frame);
        return stringBuilder.toString();
    }
}
