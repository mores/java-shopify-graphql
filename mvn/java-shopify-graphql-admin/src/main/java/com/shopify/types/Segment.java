package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Segment implements com.shopify.types.Node {
  
  private OffsetDateTime creationDate;

  
  private String id;

  
  private OffsetDateTime lastEditDate;

  
  private String name;

  
  private String query;

  public Segment() {
  }

  
  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public OffsetDateTime getLastEditDate() {
    return lastEditDate;
  }

  public void setLastEditDate(OffsetDateTime lastEditDate) {
    this.lastEditDate = lastEditDate;
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
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
    
    private OffsetDateTime creationDate;

    
    private String id;

    
    private OffsetDateTime lastEditDate;

    
    private String name;

    
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

    
    public Builder creationDate(OffsetDateTime creationDate) {
      this.creationDate = creationDate;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder lastEditDate(OffsetDateTime lastEditDate) {
      this.lastEditDate = lastEditDate;
      return this;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder query(String query) {
      this.query = query;
      return this;
    }
  }
}
