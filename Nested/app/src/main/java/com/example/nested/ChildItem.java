package com.example.nested;

public class ChildItem {




    private String ChildItemTitle;

    // Constructor of the class

    public ChildItem(String childItemTitle)
    {
        this.ChildItemTitle = childItemTitle;
    }

    // Getter and Setter method
    // for the parameter
    public String getChildItemTitle()
    {
        return ChildItemTitle;
    }

    public void setChildItemTitle(
            String childItemTitle)
    {
        ChildItemTitle = childItemTitle;
    }
}