package com.shopify.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDate;
import java.util.Objects;

/**
 * The input fields for a marketing engagement.
 */
public class MarketingEngagementInput {
  /**
   * The calendar date (in the time zone offset specified by the utcOffset field)
   * for which the metrics are being reported. For example, a shop in UTC-5 would
   * set utcOffset="-05:00" and aggregate all engagements from 05:00:00Z up to
   * 29:00:00Z (5am UTC next day) for each call.
   */
  private LocalDate occurredOn;

  /**
   * The total number of times marketing content was displayed to users, whether or
   * not an interaction occurred. For message-based platforms such as email or SMS,
   * this represents the number of marketing emails or messages that were delivered.
   */
  private Integer impressionsCount;

  /**
   * The total number of views on the marketing content. For message-based
   * platforms such as email or SMS, this represents the number of times marketing
   * emails or messages were opened. For video-based content, this represents the
   * number of times videos were played.
   */
  private Integer viewsCount;

  /**
   * The total number of interactions, such as a button press or a screen touch, that occurred on the marketing content.
   */
  private Integer clicksCount;

  /**
   * The total number of times marketing content was distributed or reposted to
   * either one's own network of followers through a social media platform or other
   * digital channels. For message-based platforms such as email or SMS, this
   * represents the number of times marketing emails or messages were forwarded.
   */
  private Integer sharesCount;

  /**
   * The total number of favorites, likes, saves, or bookmarks on the marketing content.
   */
  private Integer favoritesCount;

  /**
   * The total number of comments on the marketing content.
   */
  private Integer commentsCount;

  /**
   * The total number of unsubscribes on the marketing content. For social media
   * platforms, this represents the number of unfollows.
   */
  private Integer unsubscribesCount;

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
   * The total number of marketing emails or messages that were sent.
   */
  private Integer sendsCount;

  /**
   * The total number of all users who saw marketing content since it was
   * published. For  message-based platforms such as email or SMS, this represents
   * the number of unique users that opened a  marketing email or message. For
   * video-based content, this represents the number of unique users that  played video content.
   */
  private Integer uniqueViewsCount;

  /**
   * The total number of unique clicks on the marketing content.
   */
  private Integer uniqueClicksCount;

  /**
   * The total ad spend for the marketing content. Recurring weekly, monthly, or
   * yearly spend needs to be divided into daily amounts.
   */
  private MoneyInput adSpend;

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
   * The UTC offset for the time zone in which the metrics are being reported, in
   * the format `"+HH:MM"` or `"-HH:MM"`. Used in combination with occurredOn when
   * aggregating daily metrics. Must match the account settings for the shop to
   * minimize eventual discrepancies in reporting.
   */
  private String utcOffset;

  /**
   * The amount of sales generated from the marketing content.
   */
  private MoneyInput sales;

  /**
   * The number of online store sessions generated from the marketing content.
   */
  private Integer sessionsCount;

  /**
   * The number of orders generated from the marketing content.
   */
  private String orders;

  /**
   * The number of customers that have placed their first order. Doesn't include
   * adjustments such as edits, exchanges, or returns.
   */
  private String firstTimeCustomers;

  /**
   * The number of returning customers that have placed an order. Doesn't include
   * adjustments such as edits, exchanges, or returns.
   */
  private String returningCustomers;

  public MarketingEngagementInput() {
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
   * The total number of favorites, likes, saves, or bookmarks on the marketing content.
   */
  public Integer getFavoritesCount() {
    return favoritesCount;
  }

  public void setFavoritesCount(Integer favoritesCount) {
    this.favoritesCount = favoritesCount;
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
   * The total number of marketing emails or messages that were sent.
   */
  public Integer getSendsCount() {
    return sendsCount;
  }

  public void setSendsCount(Integer sendsCount) {
    this.sendsCount = sendsCount;
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
   * The total number of unique clicks on the marketing content.
   */
  public Integer getUniqueClicksCount() {
    return uniqueClicksCount;
  }

  public void setUniqueClicksCount(Integer uniqueClicksCount) {
    this.uniqueClicksCount = uniqueClicksCount;
  }

  /**
   * The total ad spend for the marketing content. Recurring weekly, monthly, or
   * yearly spend needs to be divided into daily amounts.
   */
  public MoneyInput getAdSpend() {
    return adSpend;
  }

  public void setAdSpend(MoneyInput adSpend) {
    this.adSpend = adSpend;
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
   * The amount of sales generated from the marketing content.
   */
  public MoneyInput getSales() {
    return sales;
  }

  public void setSales(MoneyInput sales) {
    this.sales = sales;
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
   * The number of orders generated from the marketing content.
   */
  public String getOrders() {
    return orders;
  }

  public void setOrders(String orders) {
    this.orders = orders;
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
   * The number of returning customers that have placed an order. Doesn't include
   * adjustments such as edits, exchanges, or returns.
   */
  public String getReturningCustomers() {
    return returningCustomers;
  }

  public void setReturningCustomers(String returningCustomers) {
    this.returningCustomers = returningCustomers;
  }

  @Override
  public String toString() {
    return "MarketingEngagementInput{occurredOn='" + occurredOn + "', impressionsCount='" + impressionsCount + "', viewsCount='" + viewsCount + "', clicksCount='" + clicksCount + "', sharesCount='" + sharesCount + "', favoritesCount='" + favoritesCount + "', commentsCount='" + commentsCount + "', unsubscribesCount='" + unsubscribesCount + "', complaintsCount='" + complaintsCount + "', failsCount='" + failsCount + "', sendsCount='" + sendsCount + "', uniqueViewsCount='" + uniqueViewsCount + "', uniqueClicksCount='" + uniqueClicksCount + "', adSpend='" + adSpend + "', isCumulative='" + isCumulative + "', utcOffset='" + utcOffset + "', sales='" + sales + "', sessionsCount='" + sessionsCount + "', orders='" + orders + "', firstTimeCustomers='" + firstTimeCustomers + "', returningCustomers='" + returningCustomers + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketingEngagementInput that = (MarketingEngagementInput) o;
    return Objects.equals(occurredOn, that.occurredOn) &&
        Objects.equals(impressionsCount, that.impressionsCount) &&
        Objects.equals(viewsCount, that.viewsCount) &&
        Objects.equals(clicksCount, that.clicksCount) &&
        Objects.equals(sharesCount, that.sharesCount) &&
        Objects.equals(favoritesCount, that.favoritesCount) &&
        Objects.equals(commentsCount, that.commentsCount) &&
        Objects.equals(unsubscribesCount, that.unsubscribesCount) &&
        Objects.equals(complaintsCount, that.complaintsCount) &&
        Objects.equals(failsCount, that.failsCount) &&
        Objects.equals(sendsCount, that.sendsCount) &&
        Objects.equals(uniqueViewsCount, that.uniqueViewsCount) &&
        Objects.equals(uniqueClicksCount, that.uniqueClicksCount) &&
        Objects.equals(adSpend, that.adSpend) &&
        isCumulative == that.isCumulative &&
        Objects.equals(utcOffset, that.utcOffset) &&
        Objects.equals(sales, that.sales) &&
        Objects.equals(sessionsCount, that.sessionsCount) &&
        Objects.equals(orders, that.orders) &&
        Objects.equals(firstTimeCustomers, that.firstTimeCustomers) &&
        Objects.equals(returningCustomers, that.returningCustomers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(occurredOn, impressionsCount, viewsCount, clicksCount, sharesCount, favoritesCount, commentsCount, unsubscribesCount, complaintsCount, failsCount, sendsCount, uniqueViewsCount, uniqueClicksCount, adSpend, isCumulative, utcOffset, sales, sessionsCount, orders, firstTimeCustomers, returningCustomers);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The calendar date (in the time zone offset specified by the utcOffset field)
     * for which the metrics are being reported. For example, a shop in UTC-5 would
     * set utcOffset="-05:00" and aggregate all engagements from 05:00:00Z up to
     * 29:00:00Z (5am UTC next day) for each call.
     */
    private LocalDate occurredOn;

    /**
     * The total number of times marketing content was displayed to users, whether or
     * not an interaction occurred. For message-based platforms such as email or SMS,
     * this represents the number of marketing emails or messages that were delivered.
     */
    private Integer impressionsCount;

    /**
     * The total number of views on the marketing content. For message-based
     * platforms such as email or SMS, this represents the number of times marketing
     * emails or messages were opened. For video-based content, this represents the
     * number of times videos were played.
     */
    private Integer viewsCount;

    /**
     * The total number of interactions, such as a button press or a screen touch, that occurred on the marketing content.
     */
    private Integer clicksCount;

    /**
     * The total number of times marketing content was distributed or reposted to
     * either one's own network of followers through a social media platform or other
     * digital channels. For message-based platforms such as email or SMS, this
     * represents the number of times marketing emails or messages were forwarded.
     */
    private Integer sharesCount;

    /**
     * The total number of favorites, likes, saves, or bookmarks on the marketing content.
     */
    private Integer favoritesCount;

    /**
     * The total number of comments on the marketing content.
     */
    private Integer commentsCount;

    /**
     * The total number of unsubscribes on the marketing content. For social media
     * platforms, this represents the number of unfollows.
     */
    private Integer unsubscribesCount;

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
     * The total number of marketing emails or messages that were sent.
     */
    private Integer sendsCount;

    /**
     * The total number of all users who saw marketing content since it was
     * published. For  message-based platforms such as email or SMS, this represents
     * the number of unique users that opened a  marketing email or message. For
     * video-based content, this represents the number of unique users that  played video content.
     */
    private Integer uniqueViewsCount;

    /**
     * The total number of unique clicks on the marketing content.
     */
    private Integer uniqueClicksCount;

    /**
     * The total ad spend for the marketing content. Recurring weekly, monthly, or
     * yearly spend needs to be divided into daily amounts.
     */
    private MoneyInput adSpend;

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
     * The UTC offset for the time zone in which the metrics are being reported, in
     * the format `"+HH:MM"` or `"-HH:MM"`. Used in combination with occurredOn when
     * aggregating daily metrics. Must match the account settings for the shop to
     * minimize eventual discrepancies in reporting.
     */
    private String utcOffset;

    /**
     * The amount of sales generated from the marketing content.
     */
    private MoneyInput sales;

    /**
     * The number of online store sessions generated from the marketing content.
     */
    private Integer sessionsCount;

    /**
     * The number of orders generated from the marketing content.
     */
    private String orders;

    /**
     * The number of customers that have placed their first order. Doesn't include
     * adjustments such as edits, exchanges, or returns.
     */
    private String firstTimeCustomers;

    /**
     * The number of returning customers that have placed an order. Doesn't include
     * adjustments such as edits, exchanges, or returns.
     */
    private String returningCustomers;

    public MarketingEngagementInput build() {
      MarketingEngagementInput result = new MarketingEngagementInput();
      result.occurredOn = this.occurredOn;
      result.impressionsCount = this.impressionsCount;
      result.viewsCount = this.viewsCount;
      result.clicksCount = this.clicksCount;
      result.sharesCount = this.sharesCount;
      result.favoritesCount = this.favoritesCount;
      result.commentsCount = this.commentsCount;
      result.unsubscribesCount = this.unsubscribesCount;
      result.complaintsCount = this.complaintsCount;
      result.failsCount = this.failsCount;
      result.sendsCount = this.sendsCount;
      result.uniqueViewsCount = this.uniqueViewsCount;
      result.uniqueClicksCount = this.uniqueClicksCount;
      result.adSpend = this.adSpend;
      result.isCumulative = this.isCumulative;
      result.utcOffset = this.utcOffset;
      result.sales = this.sales;
      result.sessionsCount = this.sessionsCount;
      result.orders = this.orders;
      result.firstTimeCustomers = this.firstTimeCustomers;
      result.returningCustomers = this.returningCustomers;
      return result;
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
     * The total number of times marketing content was displayed to users, whether or
     * not an interaction occurred. For message-based platforms such as email or SMS,
     * this represents the number of marketing emails or messages that were delivered.
     */
    public Builder impressionsCount(Integer impressionsCount) {
      this.impressionsCount = impressionsCount;
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

    /**
     * The total number of interactions, such as a button press or a screen touch, that occurred on the marketing content.
     */
    public Builder clicksCount(Integer clicksCount) {
      this.clicksCount = clicksCount;
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
     * The total number of favorites, likes, saves, or bookmarks on the marketing content.
     */
    public Builder favoritesCount(Integer favoritesCount) {
      this.favoritesCount = favoritesCount;
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
     * The total number of unsubscribes on the marketing content. For social media
     * platforms, this represents the number of unfollows.
     */
    public Builder unsubscribesCount(Integer unsubscribesCount) {
      this.unsubscribesCount = unsubscribesCount;
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
     * The total number of marketing emails or messages that were sent.
     */
    public Builder sendsCount(Integer sendsCount) {
      this.sendsCount = sendsCount;
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
     * The total number of unique clicks on the marketing content.
     */
    public Builder uniqueClicksCount(Integer uniqueClicksCount) {
      this.uniqueClicksCount = uniqueClicksCount;
      return this;
    }

    /**
     * The total ad spend for the marketing content. Recurring weekly, monthly, or
     * yearly spend needs to be divided into daily amounts.
     */
    public Builder adSpend(MoneyInput adSpend) {
      this.adSpend = adSpend;
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
     * The amount of sales generated from the marketing content.
     */
    public Builder sales(MoneyInput sales) {
      this.sales = sales;
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
     * The number of orders generated from the marketing content.
     */
    public Builder orders(String orders) {
      this.orders = orders;
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
     * The number of returning customers that have placed an order. Doesn't include
     * adjustments such as edits, exchanges, or returns.
     */
    public Builder returningCustomers(String returningCustomers) {
      this.returningCustomers = returningCustomers;
      return this;
    }
  }
}
