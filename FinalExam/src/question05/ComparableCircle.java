/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question05;

/**
 *
 * @author Ramu Vallapurapu
 */
public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

    public ComparableCircle(int area) {
        super(area);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        return Integer.compare(super.getArea(), o.getArea());
    }

}
