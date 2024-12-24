package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class EventConnection {
  
  private List<EventEdge> edges;

  
  private List<Event> nodes;

  
  private PageInfo pageInfo;

  public EventConnection() {
  }

  
  public List<EventEdge> getEdges() {
    return edges;
  }

  public void setEdges(List<EventEdge> edges) {
    this.edges = edges;
  }

  
  public List<Event> getNodes() {
    return nodes;
  }

  public void setNodes(List<Event> nodes) {
    this.nodes = nodes;
  }

  
  public PageInfo getPageInfo() {
    return pageInfo;
  }

  public void setPageInfo(PageInfo pageInfo) {
    this.pageInfo = pageInfo;
  }

  @Override
  public String toString() {
    return "EventConnection{edges='" + edges + "', nodes='" + nodes + "', pageInfo='" + pageInfo + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EventConnection that = (EventConnection) o;
    return Objects.equals(edges, that.edges) &&
        Objects.equals(nodes, that.nodes) &&
        Objects.equals(pageInfo, that.pageInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(edges, nodes, pageInfo);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<EventEdge> edges;

    
    private List<Event> nodes;

    
    private PageInfo pageInfo;

    public EventConnection build() {
      EventConnection result = new EventConnection();
      result.edges = this.edges;
      result.nodes = this.nodes;
      result.pageInfo = this.pageInfo;
      return result;
    }

    
    public Builder edges(List<EventEdge> edges) {
      this.edges = edges;
      return this;
    }

    
    public Builder nodes(List<Event> nodes) {
      this.nodes = nodes;
      return this;
    }

    
    public Builder pageInfo(PageInfo pageInfo) {
      this.pageInfo = pageInfo;
      return this;
    }
  }
}
