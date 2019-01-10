package com.weibo.weibo.util;

/**
 * Created by jwc on 2017/7/27.
 */
public class JedisUtils {

    public static String EventQueueKey = "EVENT";
    public static String LIKE_KEY = "BIZ_LIKE";
    public static String DISLIKE_KEY = "BIZ_DISLIKE";

    public static String getPushKey(int toId) {
        return "PUSH" + toId;
    }

    public static String getPullKey(int fromId, int toId) {
        return fromId + "PULL" + toId;
    }

    public static String getLikeKey(int entityType, int entityId) {
        return "LIKE" + ":" + entityType + ":" + entityId;
    }

    public static String getDislikeKey(int entityType, int entityId) {
        return "DISLIKE" + ":" + entityType + ":" + entityId;
    }

    public static String getFollowKey(int id) {
        return "FOLLOW" + ":" + id;
    }

    public static String getFollowerKey(int id) {
        return "FOLLOWER" + ":" + id;
    }

}
