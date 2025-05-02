package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.storefront.types.MetaobjectHandleInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Fetch a specific Metaobject by one of its unique identifiers.
 */
public class MetaobjectGraphQLQuery extends GraphQLQuery {
  public MetaobjectGraphQLQuery(MetaobjectHandleInput handle, String id, String queryName,
      Set<String> fieldsSet) {
    super("query", queryName);
    if (handle != null || fieldsSet.contains("handle")) {
        getInput().put("handle", handle);
    }if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public MetaobjectGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "metaobject";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private MetaobjectHandleInput handle;

    private String id;

    private String queryName;

    public MetaobjectGraphQLQuery build() {
      return new MetaobjectGraphQLQuery(handle, id, queryName, fieldsSet);
               
    }

    /**
     * The handle and type of the metaobject.
     */
    public Builder handle(MetaobjectHandleInput handle) {
      this.handle = handle;
      this.fieldsSet.add("handle");
      return this;
    }

    /**
     * The ID of the metaobject.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
