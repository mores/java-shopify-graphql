package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Return a product by its handle.
 */
public class ProductByHandleGraphQLQuery extends GraphQLQuery {
  public ProductByHandleGraphQLQuery(String handle, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (handle != null || fieldsSet.contains("handle")) {
        getInput().put("handle", handle);
    }
  }

  public ProductByHandleGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "productByHandle";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String handle;

    private String queryName;

    public ProductByHandleGraphQLQuery build() {
      return new ProductByHandleGraphQLQuery(handle, queryName, fieldsSet);
               
    }

    /**
     * A unique string that identifies the product. Handles are automatically
     * generated based on the product's title, and are always lowercase. Whitespace
     * and special characters are replaced with a hyphen: `-`. If there are
     * multiple consecutive whitespace or special characters, then they're replaced
     * with a single hyphen. Whitespace or special characters at the beginning are
     * removed. If a duplicate product title is used, then the handle is
     * auto-incremented by one. For example, if you had two products called
     * `Potion`, then their handles would be `potion` and `potion-1`. After a
     * product has been created, changing the product title doesn't update the handle.
     */
    public Builder handle(String handle) {
      this.handle = handle;
      this.fieldsSet.add("handle");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
