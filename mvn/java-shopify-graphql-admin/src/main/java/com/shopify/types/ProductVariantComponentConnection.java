package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class ProductVariantComponentConnection {
  
  private List<ProductVariantComponentEdge> edges;

  
  private List<ProductVariantComponent> nodes;

  
  private PageInfo pageInfo;

  public ProductVariantComponentConnection() {
  }

  
  public List<ProductVariantComponentEdge> getEdges() {
    return edges;
  }

  public void setEdges(List<ProductVariantComponentEdge> edges) {
    this.edges = edges;
  }

  
  public List<ProductVariantComponent> getNodes() {
    return nodes;
  }

  public void setNodes(List<ProductVariantComponent> nodes) {
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
    return "ProductVariantComponentConnection{edges='" + edges + "', nodes='" + nodes + "', pageInfo='" + pageInfo + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductVariantComponentConnection that = (ProductVariantComponentConnection) o;
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
    
    private List<ProductVariantComponentEdge> edges;

    
    private List<ProductVariantComponent> nodes;

    
    private PageInfo pageInfo;

    public ProductVariantComponentConnection build() {
      ProductVariantComponentConnection result = new ProductVariantComponentConnection();
      result.edges = this.edges;
      result.nodes = this.nodes;
      result.pageInfo = this.pageInfo;
      return result;
    }

    
    public Builder edges(List<ProductVariantComponentEdge> edges) {
      this.edges = edges;
      return this;
    }

    
    public Builder nodes(List<ProductVariantComponent> nodes) {
      this.nodes = nodes;
      return this;
    }

    
    public Builder pageInfo(PageInfo pageInfo) {
      this.pageInfo = pageInfo;
      return this;
    }
  }
}
