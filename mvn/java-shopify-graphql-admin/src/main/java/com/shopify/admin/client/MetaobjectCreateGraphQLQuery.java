package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.MetaobjectCreateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a metaobject entry based on an existing [`MetaobjectDefinition`](https://shopify.dev/docs/api/admin-graphql/latest/objects/MetaobjectDefinition).
 * The type must match a definition that already exists in the shop.
 *   
 * Specify field values using key-value pairs that correspond to the field
 * definitions. The mutation generates a unique handle automatically if you don't
 * provide one. You can also configure capabilities like publishable status to
 * control the metaobject's visibility across channels.
 *   
 * Learn more about [managing metaobjects](https://shopify.dev/docs/apps/build/custom-data/metaobjects/manage-metaobjects).
 */
public class MetaobjectCreateGraphQLQuery extends GraphQLQuery {
  public MetaobjectCreateGraphQLQuery(MetaobjectCreateInput metaobject, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (metaobject != null || fieldsSet.contains("metaobject")) {
        getInput().put("metaobject", metaobject);
    }
  }

  public MetaobjectCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "metaobjectCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private MetaobjectCreateInput metaobject;

    private String queryName;

    public MetaobjectCreateGraphQLQuery build() {
      return new MetaobjectCreateGraphQLQuery(metaobject, queryName, fieldsSet);
               
    }

    /**
     * The parameters for the metaobject to create.
     */
    public Builder metaobject(MetaobjectCreateInput metaobject) {
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
