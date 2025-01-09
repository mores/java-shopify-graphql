package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.MarketRegionCreateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Creates regions that belong to an existing market.
 */
public class MarketRegionsCreateGraphQLQuery extends GraphQLQuery {
  public MarketRegionsCreateGraphQLQuery(String marketId, List<MarketRegionCreateInput> regions,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (marketId != null || fieldsSet.contains("marketId")) {
        getInput().put("marketId", marketId);
    }if (regions != null || fieldsSet.contains("regions")) {
        getInput().put("regions", regions);
    }
  }

  public MarketRegionsCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "marketRegionsCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String marketId;

    private List<MarketRegionCreateInput> regions;

    private String queryName;

    public MarketRegionsCreateGraphQLQuery build() {
      return new MarketRegionsCreateGraphQLQuery(marketId, regions, queryName, fieldsSet);
               
    }

    /**
     * The ID of the market to add the regions to.
     */
    public Builder marketId(String marketId) {
      this.marketId = marketId;
      this.fieldsSet.add("marketId");
      return this;
    }

    /**
     * The regions to be created.
     */
    public Builder regions(List<MarketRegionCreateInput> regions) {
      this.regions = regions;
      this.fieldsSet.add("regions");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
