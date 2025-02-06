package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.Set;

/**
 * Runs the full product sync for a given shop.
 */
public class ProductFullSyncGraphQLQuery extends GraphQLQuery {
  public ProductFullSyncGraphQLQuery(OffsetDateTime beforeUpdatedAt, String id,
      OffsetDateTime updatedAtSince, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (beforeUpdatedAt != null || fieldsSet.contains("beforeUpdatedAt")) {
        getInput().put("beforeUpdatedAt", beforeUpdatedAt);
    }if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (updatedAtSince != null || fieldsSet.contains("updatedAtSince")) {
        getInput().put("updatedAtSince", updatedAtSince);
    }
  }

  public ProductFullSyncGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "productFullSync";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private OffsetDateTime beforeUpdatedAt;

    private String id;

    private OffsetDateTime updatedAtSince;

    private String queryName;

    public ProductFullSyncGraphQLQuery build() {
      return new ProductFullSyncGraphQLQuery(beforeUpdatedAt, id, updatedAtSince, queryName, fieldsSet);
               
    }

    /**
     * Syncs only products that haven't changed since the specified timestamp.
     */
    public Builder beforeUpdatedAt(OffsetDateTime beforeUpdatedAt) {
      this.beforeUpdatedAt = beforeUpdatedAt;
      this.fieldsSet.add("beforeUpdatedAt");
      return this;
    }

    /**
     * The product feed which needs syncing.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * Syncs only products that have changed since the specified timestamp.
     */
    public Builder updatedAtSince(OffsetDateTime updatedAtSince) {
      this.updatedAtSince = updatedAtSince;
      this.fieldsSet.add("updatedAtSince");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
