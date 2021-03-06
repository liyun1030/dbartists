// Copyright 2009 Google Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

// dbartists - Douban artists client for Android
// Copyright (C) 2011 Max Lv <max.c.lv@gmail.com>
//
// Licensed under the Apache License, Version 2.0 (the "License"); you may not
// use this file except in compliance with the License.  You may obtain a copy
// of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
// WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
// License for the specific language governing permissions and limitations
// under the License.
//
//
//                           ___====-_  _-====___
//                     _--^^^#####//      \\#####^^^--_
//                  _-^##########// (    ) \\##########^-_
//                 -############//  |\^^/|  \\############-
//               _/############//   (@::@)   \\############\_
//              /#############((     \\//     ))#############\
//             -###############\\    (oo)    //###############-
//            -#################\\  / VV \  //#################-
//           -###################\\/      \//###################-
//          _#/|##########/\######(   /\   )######/\##########|\#_
//          |/ |#/\#/\#/\/  \#/\##\  |  |  /##/\#/  \/\#/\#/\#| \|
//          `  |/  V  V  `   V  \#\| |  | |/#/  V   '  V  V  \|  '
//             `   `  `      `   / | |  | | \   '      '  '   '
//                              (  | |  | |  )
//                             __\ | |  | | /__
//                            (vvv(VVV)(VVV)vvv)
//
//                             HERE BE DRAGONS
package org.dbartists;

import android.content.IntentFilter;

public class Constants {
  public static final String EXTRA_SUBACTIVITY_ID = "subactivity_id";
  public static final String EXTRA_STATION_ID = "station_id";
  public static final String EXTRA_STORY_ID = "story_id";
  public static final String EXTRA_TOPIC_ID = "topic_id";
  public static final String EXTRA_QUERY_TERM = "query_term";
  public static final String EXTRA_QUERY_URL = "query_url";

  public static final String EXTRA_SHOW_REFRESH = "show_refresh";
  public static final String EXTRA_DESCRIPTION = "extra_description";
  public static final String EXTRA_GROUPING = "extra_grouping";
  public static final String EXTRA_SIZE = "extra_size";
  
  public static final String EXTRA_GENRE_ID = "genre_id";
  public static final String EXTRA_PAGE = "page";
  
  public static final String EXTRA_ARTIST_NAME = "artist_name";
  public static final String EXTRA_ARTIST_URL = "artist_url";
  public static final String EXTRA_ARTIST_IMG = "artist_img";
  
  public static final String EXTRA_TRACK_ID = "track_id";
  public static final String EXTRA_TRACK_NAME = "track_name";
  public static final String EXTRA_TRACK_URL = "track_url";
  public static final String REMOTE_PLAY_ACTION = "org.dbartists.REMOTE_PLAY_ACTION";
  public static final IntentFilter REMOTE_PLAY_FILTER = new IntentFilter(REMOTE_PLAY_ACTION);
  
  public static final String GENRE_ARTIST_API_URL = "http://dbmusician.sinaapp.com/artists.php";
  public static final String TOP_ARTIST_API_URL = "http://dbmusician.sinaapp.com/topartists.php";
  public static final String POP_ARTIST_API_URL = "http://dbmusician.sinaapp.com/popartists.php";
  public static final String ARTIST_MP3_API_URL = "http://dbmusician.sinaapp.com/db.php";
  public static final String SEARCH_ARTIST_API_URL = "http://dbmusician.sinaapp.com/search.php";
  public static final String ARTIST_INFO_API_URL = "http://dbmusician.sinaapp.com/artistinfo.php";
  

  private Constants() {
    // no instantiation
  }
}
