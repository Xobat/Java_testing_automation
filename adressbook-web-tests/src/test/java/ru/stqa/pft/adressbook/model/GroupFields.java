package ru.stqa.pft.adressbook.model;

public class GroupFields {
  private  String groupName;
  private  String groupHeader;
  private  String groupFooter;
  private int id = Integer.MAX_VALUE;


  public String getGroupName() {
    return groupName;
  }

  @Override
  public String toString() {
    return "GroupFields{" +
            "groupName='" + groupName + '\'' +
            ", id='" + id + '\'' +

            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    GroupFields that = (GroupFields) o;

    if (id != that.id) return false;
    return groupName != null ? groupName.equals(that.groupName) : that.groupName == null;
  }

  @Override
  public int hashCode() {
    int result = groupName != null ? groupName.hashCode() : 0;
    result = 31 * result + id;
    return result;
  }

  public String getGroupHeader() {
    return groupHeader;
  }

  public int getId() { return id; }

  public String getGroupFooter() {
    return groupFooter;
  }

  public GroupFields withId(int id) {
    this.id = id;
    return this;
  }
  public GroupFields withName(String groupName) {
    this.groupName = groupName;
    return this;
  }

  public GroupFields withHeader(String groupHeader) {
    this.groupHeader = groupHeader;
    return this;
  }

  public GroupFields withFooter(String groupFooter) {
    this.groupFooter = groupFooter;
    return this;
  }
}
