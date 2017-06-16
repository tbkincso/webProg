package edu.ubbcluj.webprog.backend.common.dto;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by kincso on 16.06.2017.
 */
public class DataPoints {
    private List<Point> points;

    public DataPoints() {
        points = new LinkedList();
    }

    public void addPoint(Point point) {
        points.add(point);
    }

    public List<Point> getPoints() {
        return points;
    }
}
