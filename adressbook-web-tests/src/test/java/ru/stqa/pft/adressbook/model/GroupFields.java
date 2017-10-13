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

  @Override
  public String toString() {
    return "GroupFields{" +
            "groupName='" + groupName + '\'' +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    GroupFields that = (GroupFields) o;

    return groupName != null ? groupName.equals(that.groupName) : that.groupName == null;
  }

  @Override
  public int hashCode() {
    return groupName != null ? groupName.hashCode() : 0;
  }

  public String getGroupFooter() {
    return groupFooter;
  }
}
