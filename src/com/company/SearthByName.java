package com.company;

import School.SchoolPerson;

/**
 * Created by Денис on 09/11/17.
 */
public class SearthByName {

    public <T extends SchoolPerson> T searth (T[] array, String name) {
        for (T element : array) {
            if (element.getName().equals(name)) {
                return element;
            }
        }
        return null;
    }


}
