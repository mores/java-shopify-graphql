package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.MarketWebPresenceUpdateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Updates a market web presence.
 */
public class MarketWebPresenceUpdateGraphQLQuery extends GraphQLQuery {
  public MarketWebPresenceUpdateGraphQLQuery(String webPresenceId,
      MarketWebPresenceUpdateInput webPresence, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (webPresenceId != null || fieldsSet.contains("webPresenceId")) {
        getInput().put("webPresenceId", webPresenceId);
    }if (webPresence != null || fieldsSet.contains("webPresence")) {
        getInput().put("webPresence", webPresence);
    }
  }

  public MarketWebPresenceUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "marketWebPresenceUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String webPresenceId;

    private MarketWebPresenceUpdateInput webPresence;

    private String queryName;

    public MarketWebPresenceUpdateGraphQLQuery build() {
      return new MarketWebPresenceUpdateGraphQLQuery(webPresenceId, webPresence, queryName, fieldsSet);
               
    }

    /**
     * The ID of the web presence to update.
     */
    public Builder webPresenceId(String webPresenceId) {
      this.webPresenceId = webPresenceId;
      this.fieldsSet.add("webPresenceId");
      return this;
    }

    /**
     * The web_presence fields used to update the market's web presence.
     */
    public Builder webPresence(MarketWebPresenceUpdateInput webPresence) {
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
