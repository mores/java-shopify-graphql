package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class SalesAgreementConnection {
  
  private List<SalesAgreementEdge> edges;

  
  private List<SalesAgreement> nodes;

  
  private PageInfo pageInfo;

  public SalesAgreementConnection() {
  }

  
  public List<SalesAgreementEdge> getEdges() {
    return edges;
  }

  public void setEdges(List<SalesAgreementEdge> edges) {
    this.edges = edges;
  }

  
  public List<SalesAgreement> getNodes() {
    return nodes;
  }

  public void setNodes(List<SalesAgreement> nodes) {
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
    return "SalesAgreementConnection{edges='" + edges + "', nodes='" + nodes + "', pageInfo='" + pageInfo + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SalesAgreementConnection that = (SalesAgreementConnection) o;
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
    
    private List<SalesAgreementEdge> edges;

    
    private List<SalesAgreement> nodes;

    
    private PageInfo pageInfo;

    public SalesAgreementConnection build() {
      SalesAgreementConnection result = new SalesAgreementConnection();
      result.edges = this.edges;
      result.nodes = this.nodes;
      result.pageInfo = this.pageInfo;
      return result;
    }

    
    public Builder edges(List<SalesAgreementEdge> edges) {
      this.edges = edges;
      return this;
    }

    
    public Builder nodes(List<SalesAgreement> nodes) {
      this.nodes = nodes;
      return this;
    }

    
    public Builder pageInfo(PageInfo pageInfo) {
      this.pageInfo = pageInfo;
      return this;
    }
  }
}
