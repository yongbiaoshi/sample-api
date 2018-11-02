package com.my.sample.api.model.dto.weather;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Data
public class CityWeather {
    /**
     * cityid : 101020100
     * update_time : 2018-11-02 12:00
     * city : 上海
     * data : [{"day":"2日（今天）","date":"2018-11-02","week":"星期五","wea":"多云转阴","air":27,"air_level":"优","air_tips":"空气很好，可以外出活动，呼吸新鲜空气，拥抱大自然！","alarm":[],"tem1":"20℃","tem2":"16℃","win":["西南风","西风"],"win_speed":"<3级","hours":[{"day":"02日08时","wea":"多云","tem":"16℃","win":"西南风","win_speed":"<3级"},{"day":"02日11时","wea":"多云","tem":"19℃","win":"西南风","win_speed":"<3级"},{"day":"02日14时","wea":"多云","tem":"19℃","win":"西南风","win_speed":"<3级"},{"day":"02日17时","wea":"多云","tem":"18℃","win":"西南风","win_speed":"<3级"},{"day":"02日20时","wea":"多云","tem":"17℃","win":"西南风","win_speed":"<3级"},{"day":"02日23时","wea":"阴","tem":"16℃","win":"西风","win_speed":"<3级"},{"day":"03日02时","wea":"阴","tem":"16℃","win":"西风","win_speed":"<3级"},{"day":"03日05时","wea":"阴","tem":"16℃","win":"西风","win_speed":"<3级"}],"index":[{"title":"紫外线指数","level":"最弱","desc":"辐射弱，涂擦SPF8-12防晒护肤品。"},{"title":"减肥指数","level":null,"desc":"天气较舒适，减肥正当时。"},{"title":"健臻·血糖指数","level":"较易波动","desc":"血糖较易波动，注意监测。"},{"title":"穿衣指数","level":"较舒适","desc":"建议穿薄外套或牛仔裤等服装。"},{"title":"洗车指数","level":"较适宜","desc":"无雨且风力较小，易保持清洁度。"},{"title":"空气污染扩散指数","level":"中","desc":"易感人群应适当减少室外活动。"}]},{"day":"3日（明天）","date":"2018-11-03","week":"星期六","wea":"阴转多云","tem1":"21℃","tem2":"17℃","win":["西风","西南风"],"win_speed":"<3级","hours":[{"day":"03日08时","wea":"阴","tem":"17℃","win":"西风","win_speed":"<3级"},{"day":"03日11时","wea":"阴","tem":"20℃","win":"西风","win_speed":"<3级"},{"day":"03日14时","wea":"阴","tem":"17℃","win":"西风","win_speed":"<3级"},{"day":"03日17时","wea":"阴","tem":"17℃","win":"西风","win_speed":"<3级"},{"day":"03日20时","wea":"阴","tem":"17℃","win":"西风","win_speed":"<3级"},{"day":"03日23时","wea":"多云","tem":"20℃","win":"西南风","win_speed":"<3级"},{"day":"04日02时","wea":"多云","tem":"20℃","win":"西南风","win_speed":"<3级"},{"day":"04日05时","wea":"多云","tem":"19℃","win":"西南风","win_speed":"<3级"}],"index":[{"title":"紫外线指数","level":"最弱","desc":"辐射弱，涂擦SPF8-12防晒护肤品。"},{"title":"减肥指数","level":null,"desc":"天气较舒适，减肥正当时。"},{"title":"健臻·血糖指数","level":"较易波动","desc":"血糖较易波动，注意监测。"},{"title":"穿衣指数","level":"较舒适","desc":"建议穿薄外套或牛仔裤等服装。"},{"title":"洗车指数","level":"较适宜","desc":"无雨且风力较小，易保持清洁度。"},{"title":"空气污染扩散指数","level":"较差","desc":"气象条件较不利于空气污染物扩散。。"}]},{"day":"4日（后天）","date":"2018-11-04","week":"星期日","wea":"多云转小雨","tem1":"23℃","tem2":"18℃","win":["西南风","西南风"],"win_speed":"<3级","hours":[{"day":"04日08时","wea":"多云","tem":"19℃","win":"西南风","win_speed":"<3级"},{"day":"04日11时","wea":"多云","tem":"21℃","win":"西南风","win_speed":"<3级"},{"day":"04日14时","wea":"多云","tem":"22℃","win":"西南风","win_speed":"<3级"},{"day":"04日17时","wea":"多云","tem":"21℃","win":"西南风","win_speed":"<3级"},{"day":"04日20时","wea":"多云","tem":"21℃","win":"西南风","win_speed":"<3级"},{"day":"04日23时","wea":"小雨","tem":"19℃","win":"西南风","win_speed":"<3级"},{"day":"05日02时","wea":"小雨","tem":"18℃","win":"西南风","win_speed":"<3级"},{"day":"05日05时","wea":"小雨","tem":"18℃","win":"西南风","win_speed":"<3级"}],"index":[{"title":"紫外线指数","level":"最弱","desc":"辐射弱，涂擦SPF8-12防晒护肤品。"},{"title":"减肥指数","level":null,"desc":"天气较舒适，减肥正当时。"},{"title":"健臻·血糖指数","level":"较易波动","desc":"血糖较易波动，注意监测。"},{"title":"穿衣指数","level":"较舒适","desc":"建议穿薄外套或牛仔裤等服装。"},{"title":"洗车指数","level":"不宜","desc":"有雨，雨水和泥水会弄脏爱车。"},{"title":"空气污染扩散指数","level":"中","desc":"易感人群应适当减少室外活动。"}]},{"day":"5日（周一）","date":"2018-11-05","week":"星期一","wea":"小雨转多云","tem1":"21℃","tem2":"17℃","win":["西南风","西南风"],"win_speed":"<3级","hours":[{"day":"05日08时","wea":"小雨","tem":"19℃","win":"西南风","win_speed":"<3级"},{"day":"05日14时","wea":"中雨","tem":"20℃","win":"西南风","win_speed":"<3级"},{"day":"05日20时","wea":"中雨","tem":"18℃","win":"西南风","win_speed":"<3级"},{"day":"06日02时","wea":"多云","tem":"18℃","win":"西南风","win_speed":"<3级"}],"index":[{"title":"紫外线指数","level":"最弱","desc":"辐射弱，涂擦SPF8-12防晒护肤品。"},{"title":"","level":null,"desc":"雨天室内运动下。"},{"title":"健臻·血糖指数","level":"较易波动","desc":"血糖较易波动，注意监测。"},{"title":"穿衣指数","level":"较舒适","desc":"建议穿薄外套或牛仔裤等服装。"},{"title":"洗车指数","level":"不宜","desc":"有雨，雨水和泥水会弄脏爱车。"},{"title":"空气污染扩散指数","level":"良","desc":"气象条件有利于空气污染物扩散。"}]},{"day":"6日（周二）","date":"2018-11-06","week":"星期二","wea":"多云","tem1":"20℃","tem2":"16℃","win":["西南风","西南风"],"win_speed":"<3级","hours":[{"day":"06日08时","wea":"多云","tem":"17℃","win":"西南风","win_speed":"<3级"},{"day":"06日14时","wea":"多云","tem":"19℃","win":"西南风","win_speed":"<3级"},{"day":"06日20时","wea":"多云","tem":"18℃","win":"西南风","win_speed":"<3级"},{"day":"07日02时","wea":"多云","tem":"17℃","win":"西南风","win_speed":"<3级"}],"index":[{"title":"紫外线指数","level":"弱","desc":"辐射较弱，涂擦SPF12-15、PA+护肤品。"},{"title":"减肥指数","level":null,"desc":"天气较舒适，减肥正当时。"},{"title":"健臻·血糖指数","level":"较易波动","desc":"血糖较易波动，注意监测。"},{"title":"穿衣指数","level":"较舒适","desc":"建议穿薄外套或牛仔裤等服装。"},{"title":"洗车指数","level":"较适宜","desc":"无雨且风力较小，易保持清洁度。"},{"title":"空气污染扩散指数","level":"中","desc":"易感人群应适当减少室外活动。"}]},{"day":"7日（周三）","date":"2018-11-07","week":"星期三","wea":"多云转小雨","tem1":"17℃","tem2":"15℃","win":["南风","西风"],"win_speed":"<3级","hours":[{"day":"07日08时","wea":"多云","tem":"16℃","win":"西南风","win_speed":"<3级"},{"day":"07日14时","wea":"多云","tem":"16℃","win":"南风","win_speed":"<3级"},{"day":"07日20时","wea":"多云","tem":"15℃","win":"南风","win_speed":"<3级"},{"day":"08日02时","wea":"阴","tem":"15℃","win":"西风","win_speed":"<3级"}],"index":[{"title":"紫外线指数","level":"最弱","desc":"辐射弱，涂擦SPF8-12防晒护肤品。"},{"title":"","level":null,"desc":"天气较舒适，减肥正当时。"},{"title":"健臻·血糖指数","level":"不易波动","desc":"天气条件好，血糖不易波动，可适时进行户外锻炼。"},{"title":"穿衣指数","level":"较冷","desc":"建议着厚外套加毛衣等服装。"},{"title":"洗车指数","level":"不宜","desc":"有雨，雨水和泥水会弄脏爱车。"},{"title":"空气污染扩散指数","level":"中","desc":"易感人群应适当减少室外活动。"}]},{"day":"8日（周四）","date":"2018-11-08","week":"星期四","wea":"小雨转大雨","tem1":"18℃","tem2":"13℃","win":["西南风","西南风"],"win_speed":"<3级","hours":[{"day":"08日08时","wea":"小雨","tem":"15℃","win":"西风","win_speed":"<3级"},{"day":"08日14时","wea":"小雨","tem":"17℃","win":"西南风","win_speed":"<3级"},{"day":"08日20时","wea":"阴","tem":"15℃","win":"西南风","win_speed":"<3级"},{"day":"09日02时","wea":"多云","tem":"14℃","win":"西南风","win_speed":"<3级"}],"index":[{"title":"紫外线指数","level":"最弱","desc":"辐射弱，涂擦SPF8-12防晒护肤品。"},{"title":"","level":null,"desc":"雨天室内运动下。"},{"title":"健臻·血糖指数","level":"不易波动","desc":"天气条件不易引起血糖波动。"},{"title":"穿衣指数","level":"较冷","desc":"建议着厚外套加毛衣等服装。"},{"title":"洗车指数","level":"不宜","desc":"有雨，雨水和泥水会弄脏爱车。"},{"title":"空气污染扩散指数","level":"良","desc":"气象条件有利于空气污染物扩散。"}]}]
     */

    private int cityid;
    @JsonProperty("update_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date updateTime;
    private String city;
    private List<DayWeather> data;

}