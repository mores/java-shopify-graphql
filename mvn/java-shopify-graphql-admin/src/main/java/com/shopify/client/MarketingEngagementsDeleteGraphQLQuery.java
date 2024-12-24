package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class MarketingEngagementsDeleteGraphQLQuery extends GraphQLQuery {
  public MarketingEngagementsDeleteGraphQLQuery(String channelHandle,
      Boolean deleteEngagementsForAllChannels, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (channelHandle != null || fieldsSet.contains("channelHandle")) {
        getInput().put("channelHandle", channelHandle);
    }if (deleteEngagementsForAllChannels != null || fieldsSet.contains("deleteEngagementsForAllChannels")) {
        getInput().put("deleteEngagementsForAllChannels", deleteEngagementsForAllChannels);
    }
  }

  public MarketingEngagementsDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "marketingEngagementsDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String channelHandle;

    private Boolean deleteEngagementsForAllChannels;

    private String queryName;

    public MarketingEngagementsDeleteGraphQLQuery build() {
      return new MarketingEngagementsDeleteGraphQLQuery(channelHandle, deleteEngagementsForAllChannels, queryName, fieldsSet);
               
    }

    
    public Builder channelHandle(String channelHandle) {
      this.channelHandle = channelHandle;
      this.fieldsSet.add("channelHandle");
      return this;
    }

    
    public Builder deleteEngagementsForAllChannels(Boolean deleteEngagementsForAllChannels) {
      this.deleteEngagementsForAllChannels = deleteEngagementsForAllChannels;
      this.fieldsSet.add("deleteEngagementsForAllChannels");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
