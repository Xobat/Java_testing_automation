package ru.stqa.pft.adressbook.model;

public class GroupFields {
  private final String groupName;
  private final String groupHeader;
  private final String groupFooter;

  public GroupFields(String groupName, String groupHeader, String groupFooter) {
    this.groupName = groupName;
    this.groupHeader = groupHeader;
    this.groupFooter = groupFooter;
  }

  public String getGroupName() {
    return groupName;
  }

  public String getGroupHeader() {
    return groupHeader;
  }

  public String getGroupFooter() {
    return groupFooter;
  }
}
