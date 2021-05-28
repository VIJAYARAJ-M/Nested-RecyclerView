package com.example.nested;

import java.util.List;

public class RootItem {

    // Declaration of the variables
    private String ParentItemTitle;
    private List<ChildItem> ChildItemList;


    public RootItem(
            String ParentItemTitle,
            List<ChildItem> ChildItemList) {

        this.ParentItemTitle = ParentItemTitle;
        this.ChildItemList = ChildItemList;
    }

    // Getter and Setter methods
    // for each parameter
    public String getParentItemTitle() {
        return ParentItemTitle;
    }

    public void setParentItemTitle(
            String parentItemTitle) {
        ParentItemTitle = parentItemTitle;
    }

    public List<ChildItem> getChildItemList() {
        return ChildItemList;
    }

    public void setChildItemList(
            List<ChildItem> childItemList) {
        ChildItemList = childItemList;
    }
}