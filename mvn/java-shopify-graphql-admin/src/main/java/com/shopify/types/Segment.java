package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * A dynamic collection of customers based on specific criteria.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Segment implements com.shopify.types.Node {
  /**
   * The date and time when the segment was added to the store.
   */
  private OffsetDateTime creationDate;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The date and time when the segment was last updated.
   */
  private OffsetDateTime lastEditDate;

  /**
   * The name of the segment.
   */
  private String name;

  /**
   * A precise definition of the segment. The definition is composed of a combination of conditions on facts about customers.
   */
  private String query;

  public Segment() {
  }

  /**
   * The date and time when the segment was added to the store.
   */
  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The date and time when the segment was last updated.
   */
  public OffsetDateTime getLastEditDate() {
    return lastEditDate;
  }

  public void setLastEditDate(OffsetDateTime lastEditDate) {
    this.lastEditDate = lastEditDate;
  }

  /**
   * The name of the segment.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * A precise definition of the segment. The definition is composed of a combination of conditions on facts about customers.
   */
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  @Override
  public String toString() {
    return "Segment{creationDate='" + creationDate + "', id='" + id + "', lastEditDate='" + lastEditDate + "', name='" + name + "', query='" + query + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Segment that = (Segment) o;
    return Objects.equals(creationDate, that.creationDate) &&
        Objects.equals(id, that.id) &&
        Objects.equals(lastEditDate, that.lastEditDate) &&
        Objects.equals(name, that.name) &&
        Objects.equals(query, that.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationDate, id, lastEditDate, name, query);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The date and time when the segment was added to the store.
     */
    private OffsetDateTime creationDate;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The date and time when the segment was last updated.
     */
    private OffsetDateTime lastEditDate;

    /**
     * The name of the segment.
     */
    private String name;

    /**
     * A precise definition of the segment. The definition is composed of a combination of conditions on facts about customers.
     */
    private String query;

    public Segment build() {
      Segment result = new Segment();
      result.creationDate = this.creationDate;
      result.id = this.id;
      result.lastEditDate = this.lastEditDate;
      result.name = this.name;
      result.query = this.query;
      return result;
    }

    /**
     * The date and time when the segment was added to the store.
     */
    public Builder creationDate(OffsetDateTime creationDate) {
      this.creationDate = creationDate;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The date and time when the segment was last updated.
     */
    public Builder lastEditDate(OffsetDateTime lastEditDate) {
      this.lastEditDate = lastEditDate;
      return this;
    }

    /**
     * The name of the segment.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * A precise definition of the segment. The definition is composed of a combination of conditions on facts about customers.
     */
    public Builder query(String query) {
      this.query = query;
      return this;
    }
  }
}
