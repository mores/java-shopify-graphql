package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class OnlineStoreThemeFileConnection {
  
  private List<OnlineStoreThemeFileEdge> edges;

  
  private List<OnlineStoreThemeFile> nodes;

  
  private PageInfo pageInfo;

  
  private List<OnlineStoreThemeFileReadResult> userErrors;

  public OnlineStoreThemeFileConnection() {
  }

  
  public List<OnlineStoreThemeFileEdge> getEdges() {
    return edges;
  }

  public void setEdges(List<OnlineStoreThemeFileEdge> edges) {
    this.edges = edges;
  }

  
  public List<OnlineStoreThemeFile> getNodes() {
    return nodes;
  }

  public void setNodes(List<OnlineStoreThemeFile> nodes) {
    this.nodes = nodes;
  }

  
  public PageInfo getPageInfo() {
    return pageInfo;
  }

  public void setPageInfo(PageInfo pageInfo) {
    this.pageInfo = pageInfo;
  }

  
  public List<OnlineStoreThemeFileReadResult> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<OnlineStoreThemeFileReadResult> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "OnlineStoreThemeFileConnection{edges='" + edges + "', nodes='" + nodes + "', pageInfo='" + pageInfo + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OnlineStoreThemeFileConnection that = (OnlineStoreThemeFileConnection) o;
    return Objects.equals(edges, that.edges) &&
        Objects.equals(nodes, that.nodes) &&
        Objects.equals(pageInfo, that.pageInfo) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(edges, nodes, pageInfo, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<OnlineStoreThemeFileEdge> edges;

    
    private List<OnlineStoreThemeFile> nodes;

    
    private PageInfo pageInfo;

    
    private List<OnlineStoreThemeFileReadResult> userErrors;

    public OnlineStoreThemeFileConnection build() {
      OnlineStoreThemeFileConnection result = new OnlineStoreThemeFileConnection();
      result.edges = this.edges;
      result.nodes = this.nodes;
      result.pageInfo = this.pageInfo;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder edges(List<OnlineStoreThemeFileEdge> edges) {
      this.edges = edges;
      return this;
    }

    
    public Builder nodes(List<OnlineStoreThemeFile> nodes) {
      this.nodes = nodes;
      return this;
    }

    
    public Builder pageInfo(PageInfo pageInfo) {
      this.pageInfo = pageInfo;
      return this;
    }

    
    public Builder userErrors(List<OnlineStoreThemeFileReadResult> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
