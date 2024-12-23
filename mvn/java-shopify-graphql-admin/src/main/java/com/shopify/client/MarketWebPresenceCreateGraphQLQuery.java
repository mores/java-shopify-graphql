package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.MarketWebPresenceCreateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a web presence for a market.
 */
public class MarketWebPresenceCreateGraphQLQuery extends GraphQLQuery {
  public MarketWebPresenceCreateGraphQLQuery(String marketId,
      MarketWebPresenceCreateInput webPresence, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (marketId != null || fieldsSet.contains("marketId")) {
        getInput().put("marketId", marketId);
    }if (webPresence != null || fieldsSet.contains("webPresence")) {
        getInput().put("webPresence", webPresence);
    }
  }

  public MarketWebPresenceCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "marketWebPresenceCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String marketId;

    private MarketWebPresenceCreateInput webPresence;

    private String queryName;

    public MarketWebPresenceCreateGraphQLQuery build() {
      return new MarketWebPresenceCreateGraphQLQuery(marketId, webPresence, queryName, fieldsSet);
               
    }

    /**
     * The ID of the market for which to create a web presence.
     */
    public Builder marketId(String marketId) {
      this.marketId = marketId;
      this.fieldsSet.add("marketId");
      return this;
    }

    /**
     * The details of the web presence to be created.
     */
    public Builder webPresence(MarketWebPresenceCreateInput webPresence) {
      this.webPresence = webPresence;
      this.fieldsSet.add("webPresence");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
