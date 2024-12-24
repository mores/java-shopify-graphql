package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class PageInfo {
  
  private String endCursor;

  
  private boolean hasNextPage;

  
  private boolean hasPreviousPage;

  
  private String startCursor;

  public PageInfo() {
  }

  
  public String getEndCursor() {
    return endCursor;
  }

  public void setEndCursor(String endCursor) {
    this.endCursor = endCursor;
  }

  
  public boolean getHasNextPage() {
    return hasNextPage;
  }

  public void setHasNextPage(boolean hasNextPage) {
    this.hasNextPage = hasNextPage;
  }

  
  public boolean getHasPreviousPage() {
    return hasPreviousPage;
  }

  public void setHasPreviousPage(boolean hasPreviousPage) {
    this.hasPreviousPage = hasPreviousPage;
  }

  
  public String getStartCursor() {
    return startCursor;
  }

  public void setStartCursor(String startCursor) {
    this.startCursor = startCursor;
  }

  @Override
  public String toString() {
    return "PageInfo{endCursor='" + endCursor + "', hasNextPage='" + hasNextPage + "', hasPreviousPage='" + hasPreviousPage + "', startCursor='" + startCursor + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PageInfo that = (PageInfo) o;
    return Objects.equals(endCursor, that.endCursor) &&
        hasNextPage == that.hasNextPage &&
        hasPreviousPage == that.hasPreviousPage &&
        Objects.equals(startCursor, that.startCursor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endCursor, hasNextPage, hasPreviousPage, startCursor);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String endCursor;

    
    private boolean hasNextPage;

    
    private boolean hasPreviousPage;

    
    private String startCursor;

    public PageInfo build() {
      PageInfo result = new PageInfo();
      result.endCursor = this.endCursor;
      result.hasNextPage = this.hasNextPage;
      result.hasPreviousPage = this.hasPreviousPage;
      result.startCursor = this.startCursor;
      return result;
    }

    
    public Builder endCursor(String endCursor) {
      this.endCursor = endCursor;
      return this;
    }

    
    public Builder hasNextPage(boolean hasNextPage) {
      this.hasNextPage = hasNextPage;
      return this;
    }

    
    public Builder hasPreviousPage(boolean hasPreviousPage) {
      this.hasPreviousPage = hasPreviousPage;
      return this;
    }

    
    public Builder startCursor(String startCursor) {
      this.startCursor = startCursor;
      return this;
    }
  }
}
