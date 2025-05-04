package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.MetaobjectHandleInput;
import com.shopify.admin.types.MetaobjectUpsertInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Retrieves a metaobject by handle, then updates it with the provided input values.
 * If no matching metaobject is found, a new metaobject is created with the provided input values.
 */
public class MetaobjectUpsertGraphQLQuery extends GraphQLQuery {
  public MetaobjectUpsertGraphQLQuery(MetaobjectHandleInput handle,
      MetaobjectUpsertInput metaobject, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (handle != null || fieldsSet.contains("handle")) {
        getInput().put("handle", handle);
    }if (metaobject != null || fieldsSet.contains("metaobject")) {
        getInput().put("metaobject", metaobject);
    }
  }

  public MetaobjectUpsertGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "metaobjectUpsert";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private MetaobjectHandleInput handle;

    private MetaobjectUpsertInput metaobject;

    private String queryName;

    public MetaobjectUpsertGraphQLQuery build() {
      return new MetaobjectUpsertGraphQLQuery(handle, metaobject, queryName, fieldsSet);
               
    }

    /**
     * The identifier of the metaobject to upsert.
     */
    public Builder handle(MetaobjectHandleInput handle) {
      this.handle = handle;
      this.fieldsSet.add("handle");
      return this;
    }

    /**
     * The parameters to upsert the metaobject.
     */
    public Builder metaobject(MetaobjectUpsertInput metaobject) {
      this.metaobject = metaobject;
      this.fieldsSet.add("metaobject");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
