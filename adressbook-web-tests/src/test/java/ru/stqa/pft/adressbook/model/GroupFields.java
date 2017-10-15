package ru.stqa.pft.adressbook.model;

public class GroupFields {
  private final String groupName;
  private final String groupHeader;
  private final String groupFooter;
  private int id;


  public GroupFields(String groupName, String groupHeader, String groupFooter, int id) {
    this.groupName = groupName;
    this.groupHeader = groupHeader;
    this.groupFooter = groupFooter;
    this.id = id;
  }



  public GroupFields(String groupName, String groupHeader, String groupFooter) {
    this.groupName = groupName;
    this.groupHeader = groupHeader;
    this.groupFooter = groupFooter;
    this.id = 0;
  }

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

  public String getGroupHeader() {
    return groupHeader;
  }

  public int getId() { return id; }

  public String getGroupFooter() {
    return groupFooter;
  }

  public void setId(int id) { this.id = id; }

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
}
