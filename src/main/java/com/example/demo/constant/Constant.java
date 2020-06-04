package com.example.demo.constant;

import com.example.demo.utils.WordCountUtils;

import java.util.List;
import java.util.Map;

/**
 * data pre analysis and sorted
 */
public class Constant {

    /**
     * content
     */
    public final static String content = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla sed suscipit metus, sit amet tristique\n" +
            "purus. Etiam sit amet leo sollicitudin, tincidunt lectus vel, ultricies mauris. Donec ultrices lorem in est\n" +
            "eleifend, et feugiat libero semper. Duis sodales gravida sapien eget efficitur. Ut mattis mollis blandit.\n" +
            "Duis nec metus gravida, posuere dolor id, pretium urna. Aliquam vitae purus ex. Etiam vitae ipsum\n" +
            "leo. Integer blandit, arcu eget commodo scelerisque, risus leo aliquet diam, in sagittis metus ex sed\n" +
            "elit. Duis vel urna non est fringilla rutrum. Ut molestie sed risus in pharetra. Maecenas eget ante at\n" +
            "nulla feugiat euismod. Suspendisse pharetra porttitor lacus non tristique.\n" +
            "Vivamus varius posuere ligula. Nullam magna metus, elementum vel elementum eu, elementum non\n" +
            "magna. Ut cursus arcu vel ligula mollis, in interdum velit maximus. Pellentesque arcu lorem, porttitor\n" +
            "et quam vitae, imperdiet venenatis magna. Etiam imperdiet erat vel lectus rhoncus sollicitudin.\n" +
            "Praesent at mi a est suscipit tempor sed eu diam. In hac habitasse platea dictumst. Morbi erat mi,\n" +
            "iaculis id hendrerit a, sollicitudin et ligula. Vivamus justo nibh, cursus at ultricies sed, varius iaculis\n" +
            "enim.\n" +
            "Donec consequat luctus sapien, quis aliquam ante tristique sit amet. Pellentesque accumsan\n" +
            "sollicitudin mi a blandit. Donec ac dui bibendum, pharetra nulla vitae, iaculis purus. Donec fermentum\n" +
            "porttitor mollis. Mauris cursus fringilla ex, eget ullamcorper ipsum lacinia in. Nam eget vehicula dui. In\n" +
            "eget turpis convallis, ultrices neque vitae, interdum turpis. Nullam non aliquam sapien, eget volutpat\n" +
            "elit. Cras pharetra ex a orci faucibus tristique at ullamcorper nibh. Proin nec lacinia ante, eu rutrum\n" +
            "sem.\n" +
            "Curabitur id libero purus. Vivamus vel velit turpis. Interdum et malesuada fames ac ante ipsum primis\n" +
            "in faucibus. Donec at urna eget augue efficitur porttitor at eu elit. Fusce feugiat tempor nulla, at\n" +
            "euismod lacus tincidunt sed. Curabitur ullamcorper dignissim nisl, eget iaculis orci vestibulum sed. Ut\n" +
            "consectetur consectetur urna vestibulum ultricies. Maecenas non felis arcu. Fusce in tortor metus.\n" +
            "Vestibulum vel felis ut lorem ultricies pretium quis ut metus. Aliquam erat volutpat. Praesent a lorem\n" +
            "porttitor, venenatis nisl volutpat, placerat dui. Vivamus ut justo eu orci tincidunt malesuada. Interdum\n" +
            "et malesuada fames ac ante ipsum primis in faucibus. Etiam facilisis nulla vel leo pretium varius.\n" +
            "Fusce eleifend tincidunt lacinia. Duis maximus, sapien ac fringilla pretium, augue leo aliquam ligula,\n" +
            "quis rutrum leo sem vel magna. Duis commodo lobortis dui, ut rhoncus dolor. Class aptent taciti\n" +
            "sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Nam nec augue augue.\n" +
            "Quisque eu orci arcu. Aliquam neque odio, eleifend a dolor sed, dapibus auctor justo. Aliquam\n" +
            "sollicitudin arcu sit amet odio gravida, nec viverra nulla efficitur. Phasellus sed libero rutrum lacus\n" +
            "sollicitudin mattis. Sed fermentum sapien ac dolor elementum, quis vehicula sem tempus.\n" +
            "Etiam et orci non orci lobortis dictum id vitae massa. Aenean eu erat nulla. Sed posuere ullamcorper\n" +
            "magna, tempor ultrices justo feugiat rhoncus. Cras fringilla ligula nec euismod tristique. Duis vitae\n" +
            "enim eget augue consectetur ultricies. Nam laoreet sapien at dictum consectetur. Suspendisse\n" +
            "tristique purus neque, ut blandit nunc tincidunt et.\n" +
            "Duis pretium condimentum diam id viverra. Pellentesque sit amet dapibus eros, ac auctor lectus.\n" +
            "Praesent eget tellus purus. Proin vel nisl sit amet orci laoreet faucibus eget eu nisi. Nulla id pharetra\n" +
            "arcu. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus ornare lectus eu metus\n" +
            "venenatis, quis porttitor nibh convallis. Nulla nunc metus, tristique quis dui sed, interdum imperdiet\n" +
            "nisl. Vestibulum mattis tincidunt lacus, imperdiet mattis libero varius rhoncus. Nam in auctor nisl.\n" +
            "Nunc tincidunt accumsan pulvinar. Class aptent taciti sociosqu ad litora torquent per conubia nostra,\n" +
            "per inceptos himenaeos. Mauris luctus scelerisque augue, vel finibus ligula semper vel. Lorem ipsum\n" +
            "dolor sit amet, consectetur adipiscing elit. Class aptent taciti sociosqu ad litora torquent per conubia\n" +
            "nostra, per inceptos himenaeos. Nunc ultricies vel nunc eget mollis.\n" +
            "Donec ligula felis, ultrices vel blandit ut, hendrerit vel turpis. Duis faucibus dapibus mi ac semper.\n" +
            "Duis id tortor tempus augue euismod tempus. Integer vehicula velit ut leo blandit sagittis. Vestibulum\n" +
            "ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Pellentesque habitant\n" +
            "morbi tristique senectus et netus et malesuada fames ac turpis egestas. Nunc ut urna vel metus\n" +
            "molestie venenatis nec non dui. Integer diam metus, aliquam a gravida et, varius id nulla. Nunc non\n" +
            "porttitor ipsum. Aliquam sapien enim, eleifend nec nunc id, tempus tempus ex. Vivamus nec urna\n" +
            "ornare, finibus leo at, posuere urna. Aenean est mi, porta ac gravida at, hendrerit quis elit. Quisque\n" +
            "urna mauris, lobortis sit amet tortor eget, laoreet consectetur tortor. Suspendisse id imperdiet nisl,\n" +
            "eget pellentesque tortor. Maecenas sit amet mi et ex ornare porta sollicitudin vitae tellus. Donec nulla\n" +
            "lorem, imperdiet non sodales vitae, congue quis sapien. Quisque nec mattis lacus. Sed dapibus nisi\n" +
            "nec libero ornare, in accumsan dolor porttitor. Praesent sodales commodo ultricies. Pellentesque\n" +
            "habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Cras id ipsum\n" +
            "vestibulum, venenatis eros vitae, maximus magna. Mauris eu blandit tortor, condimentum eleifend\n" +
            "dolor.\n" +
            "Cras eu tellus feugiat, lobortis metus ac, consectetur orci. Phasellus bibendum tincidunt massa non\n" +
            "venenatis. Nunc sed molestie metus, vel elementum tortor. Duis malesuada porta nisl ac molestie. In\n" +
            "a tellus faucibus, convallis nunc nec, sodales lacus. Donec vulputate interdum massa sed posuere. In\n" +
            "dapibus eu ligula at sodales. Sed facilisis a sem eget lobortis. Ut viverra ipsum dictum pharetra\n" +
            "auctor. Duis tincidunt nulla sapien, sit amet facilisis ante rhoncus eu. Aliquam luctus dolor tortor, vitae\n" +
            "interdum felis elementum eget. Nam mattis leo gravida ex elementum, id facilisis lacus ornare.";

    public final static Map<String, Integer> map = WordCountUtils.nameCount();
    public final static List<Map.Entry<String, Integer>> list = WordCountUtils.sort(map);

}
