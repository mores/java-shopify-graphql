package com.shopify.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDate;
import java.util.Objects;

/**
 * Marketing engagement represents customer activity taken on a marketing activity or a marketing channel.
 */
public class MarketingEngagement {
  /**
   * The total ad spend for the marketing content. Recurring weekly, monthly, or
   * yearly spend needs to be divided into daily amounts.
   */
  private MoneyV2 adSpend;

  /**
   * The unique string identifier of the channel to which the engagement metrics
   * are being provided. This should be set when and only when providing
   * channel-level engagements. This should be nil when providing activity-level
   * engagements. For the correct handle for your channel, contact your partner manager.
   */
  private String channelHandle;

  /**
   * The total number of interactions, such as a button press or a screen touch, that occurred on the marketing content.
   */
  private Integer clicksCount;

  /**
   * The total number of comments on the marketing content.
   */
  private Integer commentsCount;

  /**
   * The total number of complaints on the marketing content. For message-based
   * platforms such as email or SMS, this represents the number of marketing emails
   * or messages that were marked as spam. For social media platforms, this
   * represents the number of dislikes or the number of times marketing content was reported.
   */
  private Integer complaintsCount;

  /**
   * The total number of fails for the marketing content. For message-based
   * platforms such as email or SMS, this represents the number of bounced
   * marketing emails or messages.
   */
  private Integer failsCount;

  /**
   * The total number of favorites, likes, saves, or bookmarks on the marketing content.
   */
  private Integer favoritesCount;

  /**
   * The number of customers that have placed their first order. Doesn't include
   * adjustments such as edits, exchanges, or returns.
   */
  private String firstTimeCustomers;

  /**
   * The total number of times marketing content was displayed to users, whether or
   * not an interaction occurred. For message-based platforms such as email or SMS,
   * this represents the number of marketing emails or messages that were delivered.
   */
  private Integer impressionsCount;

  /**
   * Specifies how the provided metrics have been aggregated. Cumulative metrics
   * are aggregated from the first day of reporting up to and including
   * `occuredOn`. Non-cumulative metrics are aggregated over the single day
   * indicated in `occuredOn`. Cumulative metrics will monotonically increase in
   * time as each record includes the previous day's values, and so on.
   * Non-cumulative is strongly preferred, and support for cumulative metrics may
   * be deprecated in the future.
   */
  private boolean isCumulative;

  /**
   * The marketing activity object related to this engagement. This corresponds to
   * the marketingActivityId passed in on creation of the engagement.
   */
  private MarketingActivity marketingActivity;

  /**
   * The calendar date (in the time zone offset specified by the utcOffset field)
   * for which the metrics are being reported. For example, a shop in UTC-5 would
   * set utcOffset="-05:00" and aggregate all engagements from 05:00:00Z up to
   * 29:00:00Z (5am UTC next day) for each call.
   */
  private LocalDate occurredOn;

  /**
   * The number of orders generated from the marketing content.
   */
  private String orders;

  /**
   * The number of returning customers that have placed an order. Doesn't include
   * adjustments such as edits, exchanges, or returns.
   */
  private String returningCustomers;

  /**
   * The amount of sales generated from the marketing content.
   */
  private MoneyV2 sales;

  /**
   * The total number of marketing emails or messages that were sent.
   */
  private Integer sendsCount;

  /**
   * The number of online store sessions generated from the marketing content.
   */
  private Integer sessionsCount;

  /**
   * The total number of times marketing content was distributed or reposted to
   * either one's own network of followers through a social media platform or other
   * digital channels. For message-based platforms such as email or SMS, this
   * represents the number of times marketing emails or messages were forwarded.
   */
  private Integer sharesCount;

  /**
   * The total number of unique clicks on the marketing content.
   */
  private Integer uniqueClicksCount;

  /**
   * The total number of all users who saw marketing content since it was
   * published. For  message-based platforms such as email or SMS, this represents
   * the number of unique users that opened a  marketing email or message. For
   * video-based content, this represents the number of unique users that  played video content.
   */
  private Integer uniqueViewsCount;

  /**
   * The total number of unsubscribes on the marketing content. For social media
   * platforms, this represents the number of unfollows.
   */
  private Integer unsubscribesCount;

  /**
   * The UTC offset for the time zone in which the metrics are being reported, in
   * the format `"+HH:MM"` or `"-HH:MM"`. Used in combination with occurredOn when
   * aggregating daily metrics. Must match the account settings for the shop to
   * minimize eventual discrepancies in reporting.
   */
  private String utcOffset;

  /**
   * The total number of views on the marketing content. For message-based
   * platforms such as email or SMS, this represents the number of times marketing
   * emails or messages were opened. For video-based content, this represents the
   * number of times videos were played.
   */
  private Integer viewsCount;

  public MarketingEngagement() {
  }

  /**
   * The total ad spend for the marketing content. Recurring weekly, monthly, or
   * yearly spend needs to be divided into daily amounts.
   */
  public MoneyV2 getAdSpend() {
    return adSpend;
  }

  public void setAdSpend(MoneyV2 adSpend) {
    this.adSpend = adSpend;
  }

  /**
   * The unique string identifier of the channel to which the engagement metrics
   * are being provided. This should be set when and only when providing
   * channel-level engagements. This should be nil when providing activity-level
   * engagements. For the correct handle for your channel, contact your partner manager.
   */
  public String getChannelHandle() {
    return channelHandle;
  }

  public void setChannelHandle(String channelHandle) {
    this.channelHandle = channelHandle;
  }

  /**
   * The total number of interactions, such as a button press or a screen touch, that occurred on the marketing content.
   */
  public Integer getClicksCount() {
    return clicksCount;
  }

  public void setClicksCount(Integer clicksCount) {
    this.clicksCount = clicksCount;
  }

  /**
   * The total number of comments on the marketing content.
   */
  public Integer getCommentsCount() {
    return commentsCount;
  }

  public void setCommentsCount(Integer commentsCount) {
    this.commentsCount = commentsCount;
  }

  /**
   * The total number of complaints on the marketing content. For message-based
   * platforms such as email or SMS, this represents the number of marketing emails
   * or messages that were marked as spam. For social media platforms, this
   * represents the number of dislikes or the number of times marketing content was reported.
   */
  public Integer getComplaintsCount() {
    return complaintsCount;
  }

  public void setComplaintsCount(Integer complaintsCount) {
    this.complaintsCount = complaintsCount;
  }

  /**
   * The total number of fails for the marketing content. For message-based
   * platforms such as email or SMS, this represents the number of bounced
   * marketing emails or messages.
   */
  public Integer getFailsCount() {
    return failsCount;
  }

  public void setFailsCount(Integer failsCount) {
    this.failsCount = failsCount;
  }

  /**
   * The total number of favorites, likes, saves, or bookmarks on the marketing content.
   */
  public Integer getFavoritesCount() {
    return favoritesCount;
  }

  public void setFavoritesCount(Integer favoritesCount) {
    this.favoritesCount = favoritesCount;
  }

  /**
   * The number of customers that have placed their first order. Doesn't include
   * adjustments such as edits, exchanges, or returns.
   */
  public String getFirstTimeCustomers() {
    return firstTimeCustomers;
  }

  public void setFirstTimeCustomers(String firstTimeCustomers) {
    this.firstTimeCustomers = firstTimeCustomers;
  }

  /**
   * The total number of times marketing content was displayed to users, whether or
   * not an interaction occurred. For message-based platforms such as email or SMS,
   * this represents the number of marketing emails or messages that were delivered.
   */
  public Integer getImpressionsCount() {
    return impressionsCount;
  }

  public void setImpressionsCount(Integer impressionsCount) {
    this.impressionsCount = impressionsCount;
  }

  /**
   * Specifies how the provided metrics have been aggregated. Cumulative metrics
   * are aggregated from the first day of reporting up to and including
   * `occuredOn`. Non-cumulative metrics are aggregated over the single day
   * indicated in `occuredOn`. Cumulative metrics will monotonically increase in
   * time as each record includes the previous day's values, and so on.
   * Non-cumulative is strongly preferred, and support for cumulative metrics may
   * be deprecated in the future.
   */
  public boolean getIsCumulative() {
    return isCumulative;
  }

  public void setIsCumulative(boolean isCumulative) {
    this.isCumulative = isCumulative;
  }

  /**
   * The marketing activity object related to this engagement. This corresponds to
   * the marketingActivityId passed in on creation of the engagement.
   */
  public MarketingActivity getMarketingActivity() {
    return marketingActivity;
  }

  public void setMarketingActivity(MarketingActivity marketingActivity) {
    this.marketingActivity = marketingActivity;
  }

  /**
   * The calendar date (in the time zone offset specified by the utcOffset field)
   * for which the metrics are being reported. For example, a shop in UTC-5 would
   * set utcOffset="-05:00" and aggregate all engagements from 05:00:00Z up to
   * 29:00:00Z (5am UTC next day) for each call.
   */
  public LocalDate getOccurredOn() {
    return occurredOn;
  }

  public void setOccurredOn(LocalDate occurredOn) {
    this.occurredOn = occurredOn;
  }

  /**
   * The number of orders generated from the marketing content.
   */
  public String getOrders() {
    return orders;
  }

  public void setOrders(String orders) {
    this.orders = orders;
  }

  /**
   * The number of returning customers that have placed an order. Doesn't include
   * adjustments such as edits, exchanges, or returns.
   */
  public String getReturningCustomers() {
    return returningCustomers;
  }

  public void setReturningCustomers(String returningCustomers) {
    this.returningCustomers = returningCustomers;
  }

  /**
   * The amount of sales generated from the marketing content.
   */
  public MoneyV2 getSales() {
    return sales;
  }

  public void setSales(MoneyV2 sales) {
    this.sales = sales;
  }

  /**
   * The total number of marketing emails or messages that were sent.
   */
  public Integer getSendsCount() {
    return sendsCount;
  }

  public void setSendsCount(Integer sendsCount) {
    this.sendsCount = sendsCount;
  }

  /**
   * The number of online store sessions generated from the marketing content.
   */
  public Integer getSessionsCount() {
    return sessionsCount;
  }

  public void setSessionsCount(Integer sessionsCount) {
    this.sessionsCount = sessionsCount;
  }

  /**
   * The total number of times marketing content was distributed or reposted to
   * either one's own network of followers through a social media platform or other
   * digital channels. For message-based platforms such as email or SMS, this
   * represents the number of times marketing emails or messages were forwarded.
   */
  public Integer getSharesCount() {
    return sharesCount;
  }

  public void setSharesCount(Integer sharesCount) {
    this.sharesCount = sharesCount;
  }

  /**
   * The total number of unique clicks on the marketing content.
   */
  public Integer getUniqueClicksCount() {
    return uniqueClicksCount;
  }

  public void setUniqueClicksCount(Integer uniqueClicksCount) {
    this.uniqueClicksCount = uniqueClicksCount;
  }

  /**
   * The total number of all users who saw marketing content since it was
   * published. For  message-based platforms such as email or SMS, this represents
   * the number of unique users that opened a  marketing email or message. For
   * video-based content, this represents the number of unique users that  played video content.
   */
  public Integer getUniqueViewsCount() {
    return uniqueViewsCount;
  }

  public void setUniqueViewsCount(Integer uniqueViewsCount) {
    this.uniqueViewsCount = uniqueViewsCount;
  }

  /**
   * The total number of unsubscribes on the marketing content. For social media
   * platforms, this represents the number of unfollows.
   */
  public Integer getUnsubscribesCount() {
    return unsubscribesCount;
  }

  public void setUnsubscribesCount(Integer unsubscribesCount) {
    this.unsubscribesCount = unsubscribesCount;
  }

  /**
   * The UTC offset for the time zone in which the metrics are being reported, in
   * the format `"+HH:MM"` or `"-HH:MM"`. Used in combination with occurredOn when
   * aggregating daily metrics. Must match the account settings for the shop to
   * minimize eventual discrepancies in reporting.
   */
  public String getUtcOffset() {
    return utcOffset;
  }

  public void setUtcOffset(String utcOffset) {
    this.utcOffset = utcOffset;
  }

  /**
   * The total number of views on the marketing content. For message-based
   * platforms such as email or SMS, this represents the number of times marketing
   * emails or messages were opened. For video-based content, this represents the
   * number of times videos were played.
   */
  public Integer getViewsCount() {
    return viewsCount;
  }

  public void setViewsCount(Integer viewsCount) {
    this.viewsCount = viewsCount;
  }

  @Override
  public String toString() {
    return "MarketingEngagement{adSpend='" + adSpend + "', channelHandle='" + channelHandle + "', clicksCount='" + clicksCount + "', commentsCount='" + commentsCount + "', complaintsCount='" + complaintsCount + "', failsCount='" + failsCount + "', favoritesCount='" + favoritesCount + "', firstTimeCustomers='" + firstTimeCustomers + "', impressionsCount='" + impressionsCount + "', isCumulative='" + isCumulative + "', marketingActivity='" + marketingActivity + "', occurredOn='" + occurredOn + "', orders='" + orders + "', returningCustomers='" + returningCustomers + "', sales='" + sales + "', sendsCount='" + sendsCount + "', sessionsCount='" + sessionsCount + "', sharesCount='" + sharesCount + "', uniqueClicksCount='" + uniqueClicksCount + "', uniqueViewsCount='" + uniqueViewsCount + "', unsubscribesCount='" + unsubscribesCount + "', utcOffset='" + utcOffset + "', viewsCount='" + viewsCount + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketingEngagement that = (MarketingEngagement) o;
    return Objects.equals(adSpend, that.adSpend) &&
        Objects.equals(channelHandle, that.channelHandle) &&
        Objects.equals(clicksCount, that.clicksCount) &&
        Objects.equals(commentsCount, that.commentsCount) &&
        Objects.equals(complaintsCount, that.complaintsCount) &&
        Objects.equals(failsCount, that.failsCount) &&
        Objects.equals(favoritesCount, that.favoritesCount) &&
        Objects.equals(firstTimeCustomers, that.firstTimeCustomers) &&
        Objects.equals(impressionsCount, that.impressionsCount) &&
        isCumulative == that.isCumulative &&
        Objects.equals(marketingActivity, that.marketingActivity) &&
        Objects.equals(occurredOn, that.occurredOn) &&
        Objects.equals(orders, that.orders) &&
        Objects.equals(returningCustomers, that.returningCustomers) &&
        Objects.equals(sales, that.sales) &&
        Objects.equals(sendsCount, that.sendsCount) &&
        Objects.equals(sessionsCount, that.sessionsCount) &&
        Objects.equals(sharesCount, that.sharesCount) &&
        Objects.equals(uniqueClicksCount, that.uniqueClicksCount) &&
        Objects.equals(uniqueViewsCount, that.uniqueViewsCount) &&
        Objects.equals(unsubscribesCount, that.unsubscribesCount) &&
        Objects.equals(utcOffset, that.utcOffset) &&
        Objects.equals(viewsCount, that.viewsCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adSpend, channelHandle, clicksCount, commentsCount, complaintsCount, failsCount, favoritesCount, firstTimeCustomers, impressionsCount, isCumulative, marketingActivity, occurredOn, orders, returningCustomers, sales, sendsCount, sessionsCount, sharesCount, uniqueClicksCount, uniqueViewsCount, unsubscribesCount, utcOffset, viewsCount);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The total ad spend for the marketing content. Recurring weekly, monthly, or
     * yearly spend needs to be divided into daily amounts.
     */
    private MoneyV2 adSpend;

    /**
     * The unique string identifier of the channel to which the engagement metrics
     * are being provided. This should be set when and only when providing
     * channel-level engagements. This should be nil when providing activity-level
     * engagements. For the correct handle for your channel, contact your partner manager.
     */
    private String channelHandle;

    /**
     * The total number of interactions, such as a button press or a screen touch, that occurred on the marketing content.
     */
    private Integer clicksCount;

    /**
     * The total number of comments on the marketing content.
     */
    private Integer commentsCount;

    /**
     * The total number of complaints on the marketing content. For message-based
     * platforms such as email or SMS, this represents the number of marketing emails
     * or messages that were marked as spam. For social media platforms, this
     * represents the number of dislikes or the number of times marketing content was reported.
     */
    private Integer complaintsCount;

    /**
     * The total number of fails for the marketing content. For message-based
     * platforms such as email or SMS, this represents the number of bounced
     * marketing emails or messages.
     */
    private Integer failsCount;

    /**
     * The total number of favorites, likes, saves, or bookmarks on the marketing content.
     */
    private Integer favoritesCount;

    /**
     * The number of customers that have placed their first order. Doesn't include
     * adjustments such as edits, exchanges, or returns.
     */
    private String firstTimeCustomers;

    /**
     * The total number of times marketing content was displayed to users, whether or
     * not an interaction occurred. For message-based platforms such as email or SMS,
     * this represents the number of marketing emails or messages that were delivered.
     */
    private Integer impressionsCount;

    /**
     * Specifies how the provided metrics have been aggregated. Cumulative metrics
     * are aggregated from the first day of reporting up to and including
     * `occuredOn`. Non-cumulative metrics are aggregated over the single day
     * indicated in `occuredOn`. Cumulative metrics will monotonically increase in
     * time as each record includes the previous day's values, and so on.
     * Non-cumulative is strongly preferred, and support for cumulative metrics may
     * be deprecated in the future.
     */
    private boolean isCumulative;

    /**
     * The marketing activity object related to this engagement. This corresponds to
     * the marketingActivityId passed in on creation of the engagement.
     */
    private MarketingActivity marketingActivity;

    /**
     * The calendar date (in the time zone offset specified by the utcOffset field)
     * for which the metrics are being reported. For example, a shop in UTC-5 would
     * set utcOffset="-05:00" and aggregate all engagements from 05:00:00Z up to
     * 29:00:00Z (5am UTC next day) for each call.
     */
    private LocalDate occurredOn;

    /**
     * The number of orders generated from the marketing content.
     */
    private String orders;

    /**
     * The number of returning customers that have placed an order. Doesn't include
     * adjustments such as edits, exchanges, or returns.
     */
    private String returningCustomers;

    /**
     * The amount of sales generated from the marketing content.
     */
    private MoneyV2 sales;

    /**
     * The total number of marketing emails or messages that were sent.
     */
    private Integer sendsCount;

    /**
     * The number of online store sessions generated from the marketing content.
     */
    private Integer sessionsCount;

    /**
     * The total number of times marketing content was distributed or reposted to
     * either one's own network of followers through a social media platform or other
     * digital channels. For message-based platforms such as email or SMS, this
     * represents the number of times marketing emails or messages were forwarded.
     */
    private Integer sharesCount;

    /**
     * The total number of unique clicks on the marketing content.
     */
    private Integer uniqueClicksCount;

    /**
     * The total number of all users who saw marketing content since it was
     * published. For  message-based platforms such as email or SMS, this represents
     * the number of unique users that opened a  marketing email or message. For
     * video-based content, this represents the number of unique users that  played video content.
     */
    private Integer uniqueViewsCount;

    /**
     * The total number of unsubscribes on the marketing content. For social media
     * platforms, this represents the number of unfollows.
     */
    private Integer unsubscribesCount;

    /**
     * The UTC offset for the time zone in which the metrics are being reported, in
     * the format `"+HH:MM"` or `"-HH:MM"`. Used in combination with occurredOn when
     * aggregating daily metrics. Must match the account settings for the shop to
     * minimize eventual discrepancies in reporting.
     */
    private String utcOffset;

    /**
     * The total number of views on the marketing content. For message-based
     * platforms such as email or SMS, this represents the number of times marketing
     * emails or messages were opened. For video-based content, this represents the
     * number of times videos were played.
     */
    private Integer viewsCount;

    public MarketingEngagement build() {
      MarketingEngagement result = new MarketingEngagement();
      result.adSpend = this.adSpend;
      result.channelHandle = this.channelHandle;
      result.clicksCount = this.clicksCount;
      result.commentsCount = this.commentsCount;
      result.complaintsCount = this.complaintsCount;
      result.failsCount = this.failsCount;
      result.favoritesCount = this.favoritesCount;
      result.firstTimeCustomers = this.firstTimeCustomers;
      result.impressionsCount = this.impressionsCount;
      result.isCumulative = this.isCumulative;
      result.marketingActivity = this.marketingActivity;
      result.occurredOn = this.occurredOn;
      result.orders = this.orders;
      result.returningCustomers = this.returningCustomers;
      result.sales = this.sales;
      result.sendsCount = this.sendsCount;
      result.sessionsCount = this.sessionsCount;
      result.sharesCount = this.sharesCount;
      result.uniqueClicksCount = this.uniqueClicksCount;
      result.uniqueViewsCount = this.uniqueViewsCount;
      result.unsubscribesCount = this.unsubscribesCount;
      result.utcOffset = this.utcOffset;
      result.viewsCount = this.viewsCount;
      return result;
    }

    /**
     * The total ad spend for the marketing content. Recurring weekly, monthly, or
     * yearly spend needs to be divided into daily amounts.
     */
    public Builder adSpend(MoneyV2 adSpend) {
      this.adSpend = adSpend;
      return this;
    }

    /**
     * The unique string identifier of the channel to which the engagement metrics
     * are being provided. This should be set when and only when providing
     * channel-level engagements. This should be nil when providing activity-level
     * engagements. For the correct handle for your channel, contact your partner manager.
     */
    public Builder channelHandle(String channelHandle) {
      this.channelHandle = channelHandle;
      return this;
    }

    /**
     * The total number of interactions, such as a button press or a screen touch, that occurred on the marketing content.
     */
    public Builder clicksCount(Integer clicksCount) {
      this.clicksCount = clicksCount;
      return this;
    }

    /**
     * The total number of comments on the marketing content.
     */
    public Builder commentsCount(Integer commentsCount) {
      this.commentsCount = commentsCount;
      return this;
    }

    /**
     * The total number of complaints on the marketing content. For message-based
     * platforms such as email or SMS, this represents the number of marketing emails
     * or messages that were marked as spam. For social media platforms, this
     * represents the number of dislikes or the number of times marketing content was reported.
     */
    public Builder complaintsCount(Integer complaintsCount) {
      this.complaintsCount = complaintsCount;
      return this;
    }

    /**
     * The total number of fails for the marketing content. For message-based
     * platforms such as email or SMS, this represents the number of bounced
     * marketing emails or messages.
     */
    public Builder failsCount(Integer failsCount) {
      this.failsCount = failsCount;
      return this;
    }

    /**
     * The total number of favorites, likes, saves, or bookmarks on the marketing content.
     */
    public Builder favoritesCount(Integer favoritesCount) {
      this.favoritesCount = favoritesCount;
      return this;
    }

    /**
     * The number of customers that have placed their first order. Doesn't include
     * adjustments such as edits, exchanges, or returns.
     */
    public Builder firstTimeCustomers(String firstTimeCustomers) {
      this.firstTimeCustomers = firstTimeCustomers;
      return this;
    }

    /**
     * The total number of times marketing content was displayed to users, whether or
     * not an interaction occurred. For message-based platforms such as email or SMS,
     * this represents the number of marketing emails or messages that were delivered.
     */
    public Builder impressionsCount(Integer impressionsCount) {
      this.impressionsCount = impressionsCount;
      return this;
    }

    /**
     * Specifies how the provided metrics have been aggregated. Cumulative metrics
     * are aggregated from the first day of reporting up to and including
     * `occuredOn`. Non-cumulative metrics are aggregated over the single day
     * indicated in `occuredOn`. Cumulative metrics will monotonically increase in
     * time as each record includes the previous day's values, and so on.
     * Non-cumulative is strongly preferred, and support for cumulative metrics may
     * be deprecated in the future.
     */
    public Builder isCumulative(boolean isCumulative) {
      this.isCumulative = isCumulative;
      return this;
    }

    /**
     * The marketing activity object related to this engagement. This corresponds to
     * the marketingActivityId passed in on creation of the engagement.
     */
    public Builder marketingActivity(MarketingActivity marketingActivity) {
      this.marketingActivity = marketingActivity;
      return this;
    }

    /**
     * The calendar date (in the time zone offset specified by the utcOffset field)
     * for which the metrics are being reported. For example, a shop in UTC-5 would
     * set utcOffset="-05:00" and aggregate all engagements from 05:00:00Z up to
     * 29:00:00Z (5am UTC next day) for each call.
     */
    public Builder occurredOn(LocalDate occurredOn) {
      this.occurredOn = occurredOn;
      return this;
    }

    /**
     * The number of orders generated from the marketing content.
     */
    public Builder orders(String orders) {
      this.orders = orders;
      return this;
    }

    /**
     * The number of returning customers that have placed an order. Doesn't include
     * adjustments such as edits, exchanges, or returns.
     */
    public Builder returningCustomers(String returningCustomers) {
      this.returningCustomers = returningCustomers;
      return this;
    }

    /**
     * The amount of sales generated from the marketing content.
     */
    public Builder sales(MoneyV2 sales) {
      this.sales = sales;
      return this;
    }

    /**
     * The total number of marketing emails or messages that were sent.
     */
    public Builder sendsCount(Integer sendsCount) {
      this.sendsCount = sendsCount;
      return this;
    }

    /**
     * The number of online store sessions generated from the marketing content.
     */
    public Builder sessionsCount(Integer sessionsCount) {
      this.sessionsCount = sessionsCount;
      return this;
    }

    /**
     * The total number of times marketing content was distributed or reposted to
     * either one's own network of followers through a social media platform or other
     * digital channels. For message-based platforms such as email or SMS, this
     * represents the number of times marketing emails or messages were forwarded.
     */
    public Builder sharesCount(Integer sharesCount) {
      this.sharesCount = sharesCount;
      return this;
    }

    /**
     * The total number of unique clicks on the marketing content.
     */
    public Builder uniqueClicksCount(Integer uniqueClicksCount) {
      this.uniqueClicksCount = uniqueClicksCount;
      return this;
    }

    /**
     * The total number of all users who saw marketing content since it was
     * published. For  message-based platforms such as email or SMS, this represents
     * the number of unique users that opened a  marketing email or message. For
     * video-based content, this represents the number of unique users that  played video content.
     */
    public Builder uniqueViewsCount(Integer uniqueViewsCount) {
      this.uniqueViewsCount = uniqueViewsCount;
      return this;
    }

    /**
     * The total number of unsubscribes on the marketing content. For social media
     * platforms, this represents the number of unfollows.
     */
    public Builder unsubscribesCount(Integer unsubscribesCount) {
      this.unsubscribesCount = unsubscribesCount;
      return this;
    }

    /**
     * The UTC offset for the time zone in which the metrics are being reported, in
     * the format `"+HH:MM"` or `"-HH:MM"`. Used in combination with occurredOn when
     * aggregating daily metrics. Must match the account settings for the shop to
     * minimize eventual discrepancies in reporting.
     */
    public Builder utcOffset(String utcOffset) {
      this.utcOffset = utcOffset;
      return this;
    }

    /**
     * The total number of views on the marketing content. For message-based
     * platforms such as email or SMS, this represents the number of times marketing
     * emails or messages were opened. For video-based content, this represents the
     * number of times videos were played.
     */
    public Builder viewsCount(Integer viewsCount) {
      this.viewsCount = viewsCount;
      return this;
    }
  }
}
