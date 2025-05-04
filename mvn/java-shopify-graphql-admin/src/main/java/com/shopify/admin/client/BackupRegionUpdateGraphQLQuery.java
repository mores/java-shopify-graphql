package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.BackupRegionUpdateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Update the backup region that is used when we have no better signal of what region a buyer is in.
 */
public class BackupRegionUpdateGraphQLQuery extends GraphQLQuery {
  public BackupRegionUpdateGraphQLQuery(BackupRegionUpdateInput region, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (region != null || fieldsSet.contains("region")) {
        getInput().put("region", region);
    }
  }

  public BackupRegionUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "backupRegionUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private BackupRegionUpdateInput region;

    private String queryName;

    public BackupRegionUpdateGraphQLQuery build() {
      return new BackupRegionUpdateGraphQLQuery(region, queryName, fieldsSet);
               
    }

    /**
     * Optional input representing the region to be updated. If not provided, the existing regions remain unchanged.
     */
    public Builder region(BackupRegionUpdateInput region) {
      this.region = region;
      this.fieldsSet.add("region");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
