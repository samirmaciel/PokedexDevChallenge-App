package com.samirmaciel.pokedexdevchallenge.feature.util

import com.samirmaciel.pokedexdevchallenge.R


fun getPokemonType(type : String) : Int?{
    return maptypes[type]
}

val maptypes = mapOf<String, Int>(

    "bug" to R.drawable.ic_typebug,
    "dark" to R.drawable.ic_typedark,
    "dragon" to R.drawable.ic_typedragon,
    "electric" to R.drawable.ic_typeelectric,
    "fairy" to R.drawable.ic_typefairy,
    "fighting" to R.drawable.ic_typefighting,
    "fire" to R.drawable.ic_typefire,
    "flying" to R.drawable.ic_typeflying,
    "ghost" to R.drawable.ic_typeghost,
    "grass" to R.drawable.ic_typegrass,
    "ground" to R.drawable.ic_typeground,
    "ice" to R.drawable.ic_typeice,
    "normal" to R.drawable.ic_typenormal,
    "poison" to R.drawable.ic_typepoison,
    "psychic" to R.drawable.ic_typepsychic,
    "steel" to R.drawable.ic_typesteel,
    "water" to R.drawable.ic_typewater,

)

val mapTypes = mapOf<Int , String>(
    1 to "grass",
    2 to "grass",
    3 to "grass",
    4 to "fire",
    5 to "fire",
    6 to "fire",
    7 to "water",
    8 to "water",
    9 to "water",
    10 to "bug",
    11 to "bug",
    12 to "bug",
    13 to "bug",
    14 to "bug",
    15 to "bug",
    16 to "normal",
    17 to "normal",
    18 to "normal",
    19 to "normal",
    20 to "normal",
    21 to "normal",
    22 to "normal",
    23 to "poison",
    24 to "poison",
    25 to "electric",
    26 to "electric",
    27 to "ground",
    28 to "ground",
    29 to "poison",
    30 to "poison",
    31 to "poison",
    32 to "poison",
    33 to "poison",
    34 to "poison",
    35 to "fairy",
    36 to "fairy",
    37 to "fire",
    38 to "fire",
    39 to "normal",
    40 to "normal",
    41 to "poison",
    42 to "poison",
    43 to "grass",
    44 to "grass",
    45 to "grass",
    46 to "bug",
    47 to "bug",
    48 to "bug",
    49 to "bug",
    50 to "ground",
    51 to "ground",
    52 to "normal",
    53 to "normal",
    54 to "water",
    55 to "water",
    56 to "fighting",
    57 to "fighting",
    58 to "fire",
    59 to "fire",
    60 to "water",
    61 to "water",
    62 to "water",
    63 to "psychic",
    64 to "psychic",
    65 to "psychic",
    66 to "fighting",
    67 to "fighting",
    68 to "fighting",
    69 to "grass",
    70 to "grass",
    71 to "grass",
    72 to "water",
    73 to "water",
    74 to "rock",
    75 to "rock",
    76 to "rock",
    77 to "fire",
    78 to "fire",
    79 to "water",
    80 to "water",
    81 to "electric",
    82 to "electric",
    83 to "normal",
    84 to "normal",
    85 to "normal",
    86 to "water",
    87 to "water",
    88 to "poison",
    89 to "poison",
    90 to "water",
    91 to "water",
    92 to "ghost",
    93 to "ghost",
    94 to "ghost",
    95 to "rock",
    96 to "psychic",
    97 to "psychic",
    98 to "water",
    99 to "water",
    100 to "electric",
    101 to "electric",
    102 to "grass",
    103 to "grass",
    104 to "ground",
    105 to "ground",
    106 to "fighting",
    107 to "fighting",
    108 to "normal",
    109 to "poison",
    110 to "poison",
    111 to "ground",
    112 to "ground",
    113 to "normal",
    114 to "grass",
    115 to "normal",
    116 to "water",
    117 to "water",
    118 to "water",
    119 to "water",
    120 to "water",
    121 to "water",
    122 to "psychic",
    123 to "bug",
    124 to "ice",
    125 to "electric",
    126 to "fire",
    127 to "bug",
    128 to "normal",
    129 to "water",
    130 to "water",
    131 to "water",
    132 to "normal",
    133 to "normal",
    134 to "water",
    135 to "electric",
    136 to "fire",
    137 to "normal",
    138 to "rock",
    139 to "rock",
    140 to "rock",
    141 to "rock",
    142 to "rock",
    143 to "normal",
    144 to "ice",
    145 to "electric",
    146 to "fire",
    147 to "dragon",
    148 to "dragon",
    149 to "dragon",
    150 to "psychic",
    151 to "psychic",
    152 to "grass",
    153 to "grass",
    154 to "grass",
    155 to "fire",
    156 to "fire",
    157 to "fire",
    158 to "water",
    159 to "water",
    160 to "water",
    161 to "normal",
    162 to "normal",
    163 to "normal",
    164 to "normal",
    165 to "bug",
    166 to "bug",
    167 to "bug",
    168 to "bug",
    169 to "poison",
    170 to "water",
    171 to "water",
    172 to "electric",
    173 to "fairy",
    174 to "normal",
    175 to "fairy",
    176 to "fairy",
    177 to "psychic",
    178 to "psychic",
    179 to "electric",
    180 to "electric",
    181 to "electric",
    182 to "grass",
    183 to "water",
    184 to "water",
    185 to "rock",
    186 to "water",
    187 to "grass",
    188 to "grass",
    189 to "grass",
    190 to "normal",
    191 to "grass",
    192 to "grass",
    193 to "bug",
    194 to "water",
    195 to "water",
    196 to "psychic",
    197 to "dark",
    198 to "dark",
    199 to "water",
    200 to "ghost",
    201 to "psychic",
    202 to "psychic",
    203 to "normal",
    204 to "bug",
    205 to "bug",
    206 to "normal",
    207 to "ground",
    208 to "steel",
    209 to "fairy",
    210 to "fairy",
    211 to "water",
    212 to "bug",
    213 to "bug",
    214 to "bug",
    215 to "dark",
    216 to "normal",
    217 to "normal",
    218 to "fire",
    219 to "fire",
    220 to "ice",
    221 to "ice",
    222 to "water",
    223 to "water",
    224 to "water",
    225 to "ice",
    226 to "water",
    227 to "steel",
    228 to "dark",
    229 to "dark",
    230 to "water",
    231 to "ground",
    232 to "ground",
    233 to "normal",
    234 to "normal",
    235 to "normal",
    236 to "fighting",
    237 to "fighting",
    238 to "ice",
    239 to "electric",
    240 to "fire",
    241 to "normal",
    242 to "normal",
    243 to "electric",
    244 to "fire",
    245 to "water",
    246 to "rock",
    247 to "rock",
    248 to "rock",
    249 to "psychic",
    250 to "fire",
    251 to "psychic",
    252 to "grass",
    253 to "grass",
    254 to "grass",
    255 to "fire",
    256 to "fire",
    257 to "fire",
    258 to "water",
    259 to "water",
    260 to "water",
    261 to "dark",
    262 to "dark",
    263 to "normal",
    264 to "normal",
    265 to "bug",
    266 to "bug",
    267 to "bug",
    268 to "bug",
    269 to "bug",
    270 to "water",
    271 to "water",
    272 to "water",
    273 to "grass",
    274 to "grass",
    275 to "grass",
    276 to "normal",
    277 to "normal",
    278 to "water",
    279 to "water",
    280 to "psychic",
    281 to "psychic",
    282 to "psychic",
    283 to "bug",
    284 to "bug",
    285 to "grass",
    286 to "grass",
    287 to "normal",
    288 to "normal",
    289 to "normal",
    290 to "bug",
    291 to "bug",
    292 to "bug",
    293 to "normal",
    294 to "normal",
    295 to "normal",
    296 to "fighting",
    297 to "fighting",
    298 to "normal",
    299 to "rock",
    300 to "normal",
    301 to "normal",
    302 to "dark",
    303 to "steel",
    304 to "steel",
    305 to "steel",
    306 to "steel",
    307 to "fighting",
    308 to "fighting",
    309 to "electric",
    310 to "electric",
    311 to "electric",
    312 to "electric",
    313 to "bug",
    314 to "bug",
    315 to "grass",
    316 to "poison",
    317 to "poison",
    318 to "water",
    319 to "water",
    320 to "water",
    321 to "water",
    322 to "fire",
    323 to "fire",
    324 to "fire",
    325 to "psychic",
    326 to "psychic",
    327 to "normal",
    328 to "ground",
    329 to "ground",
    330 to "ground",
    331 to "grass",
    332 to "grass",
    333 to "normal",
    334 to "dragon",
    335 to "normal",
    336 to "poison",
    337 to "rock",
    361 to "ice",
    362 to "ice",
    363 to "ice",
    364 to "ice",
    365 to "ice",
    366 to "water",
    367 to "water",
    516 to "water",
    517 to "psychic",
    518 to "psychic",
    519 to "normal",
    520 to "normal",
    521 to "normal",
    522 to "electric",
    523 to "electric",
    524 to "rock",
    525 to "rock",
    526 to "rock",
    527 to "psychic",
    528 to "psychic",
    529 to "ground",
    530 to "ground",
    531 to "normal",
    532 to "fighting",
    533 to "fighting",
    534 to "fighting",
    535 to "water",
    536 to "water",
    537 to "water",
    538 to "fighting",
    539 to "fighting",
    540 to "bug",
    541 to "bug",
    542 to "bug",
    543 to "bug",
    544 to "bug",
    545 to "bug",
    546 to "grass",
    547 to "grass",
    548 to "grass",
    549 to "grass",
    550 to "water",
    551 to "ground",
    552 to "ground",
    553 to "ground",
    554 to "fire",
    555 to "fire",
    556 to "grass",
    557 to "bug",
    558 to "bug",
    559 to "dark",
    560 to "dark",
    561 to "psychic",
    562 to "ghost",
    563 to "ghost",
    564 to "water",
    565 to "water",
    566 to "rock",
    567 to "rock",
    568 to "poison",
    569 to "poison",
    570 to "dark",
    571 to "dark",
    572 to "normal",
    573 to "normal",
    574 to "psychic",
    575 to "psychic",
    576 to "psychic",
    577 to "psychic",
    578 to "psychic",
    579 to "psychic",
    580 to "water",
    581 to "water",
    582 to "ice",
    583 to "ice",
    584 to "ice",
    585 to "normal",
    586 to "normal",
    587 to "electric",
    588 to "bug",
    589 to "bug",
    590 to "grass",
    591 to "grass",
    592 to "water",
    593 to "water",
    594 to "water",
    595 to "bug",
    596 to "bug",
    597 to "grass",
    598 to "grass",
    599 to "steel",
    600 to "steel",
    601 to "steel",
    602 to "electric",
    603 to "electric",
    604 to "electric",
    605 to "psychic",
    606 to "psychic",
    607 to "ghost",
    608 to "ghost",
    609 to "ghost",
    610 to "dragon",
    611 to "dragon",
    612 to "dragon",
    613 to "ice",
    614 to "ice",
    615 to "ice",
    616 to "bug",
    617 to "bug",
    618 to "ground",
    619 to "fighting",
    620 to "fighting",
    621 to "dragon",
    622 to "ground",
    623 to "ground",
    624 to "dark",
    625 to "dark",
    626 to "normal",
    627 to "normal",
    628 to "normal",
    629 to "dark",
    630 to "dark",
    631 to "fire",
    632 to "bug",
    633 to "dark",
    634 to "dark",
    635 to "dark",
    636 to "bug",
    637 to "bug",
    638 to "steel",
    639 to "rock",
    640 to "grass",
    641 to "flying",
    642 to "electric",
    643 to "dragon",
    644 to "dragon",
    645 to "ground",
    646 to "dragon",
    647 to "water",
    648 to "normal",
    649 to "bug",
    650 to "grass",
    651 to "grass",
    652 to "grass",
    653 to "fire",
    654 to "fire",
    655 to "fire",
    656 to "water",
    657 to "water",
    658 to "water",
    659 to "normal",
    660 to "normal",
    661 to "normal",
    662 to "fire",
    663 to "fire",
    664 to "bug",
    665 to "bug",
    666 to "bug",
    667 to "fire",
    668 to "fire",
    669 to "fairy",
    670 to "fairy",
    671 to "fairy",
    672 to "grass",
    673 to "grass",
    674 to "fighting",
    675 to "fighting",
    676 to "normal",
    677 to "psychic",
    678 to "psychic",
    679 to "steel",
    680 to "steel",
    681 to "steel",
    682 to "fairy",
    683 to "fairy",
    684 to "fairy",
    685 to "fairy",
    686 to "dark",
    687 to "dark",
    688 to "rock",
    689 to "rock",
    690 to "poison",
    691 to "poison",
    692 to "water",
    693 to "water",
    694 to "electric",
    695 to "electric",
    696 to "rock",
    697 to "rock",
    698 to "rock",
    699 to "rock",
    700 to "fairy",
    701 to "fighting",
    702 to "electric",
    703 to "rock",
    704 to "dragon",
    705 to "dragon",
    706 to "dragon",
    707 to "steel",
    708 to "ghost",
    709 to "ghost",
    710 to "ghost",
    711 to "ghost",
    712 to "ice",
    713 to "ice",
    714 to "flying",
    715 to "flying",
    716 to "fairy",
    717 to "dark",
    718 to "dragon",
    719 to "rock",
    720 to "psychic",
    721 to "fire",
    722 to "grass",
    723 to "grass",
    724 to "grass",
    725 to "fire",
    726 to "fire",
    727 to "fire",
    728 to "water",
    729 to "water",
    730 to "water",
    731 to "normal",
    732 to "normal",
    733 to "normal",
    734 to "normal",
    735 to "normal",
    736 to "bug",
    737 to "bug",
    738 to "bug",
    739 to "fighting",
    740 to "fighting",
    741 to "fire",
    742 to "bug",
    743 to "bug",
    744 to "rock",
    745 to "rock",
    746 to "water",
    747 to "poison",
    748 to "poison",
    749 to "ground",
    750 to "ground",
    751 to "water",
    752 to "water",
    753 to "grass",
    754 to "grass",
    755 to "grass",
    756 to "grass",
    757 to "poison",
    758 to "poison",
    759 to "normal",
    760 to "normal",
    761 to "grass",
    762 to "grass",
    763 to "grass",
    764 to "fairy",
    765 to "normal",
    766 to "fighting",
    767 to "bug",
    768 to "bug",
    769 to "ghost",
    770 to "ghost",
    771 to "water",
    772 to "normal",
    773 to "normal",
    774 to "rock",
    775 to "normal",
    776 to "fire",
    777 to "electric",
    778 to "ghost",
    779 to "water",
    780 to "normal",
    781 to "ghost",
    782 to "dragon",
    783 to "dragon",
    784 to "dragon",
    785 to "electric",
    786 to "psychic",
    787 to "grass",
    788 to "water",
    789 to "psychic",
    790 to "psychic",
    791 to "psychic",
    792 to "psychic",
    793 to "rock",
    794 to "bug",
    795 to "bug",
    796 to "electric",
    797 to "steel",
    798 to "grass",
    799 to "dark",
    800 to "psychic",
    801 to "steel",
    802 to "fighting",
    803 to "poison",
    804 to "poison",
    805 to "rock",
    806 to "fire",
    807 to "electric",
    808 to "steel",
    809 to "steel",
    810 to "grass",
    811 to "grass",
    812 to "grass",
    813 to "fire",
    814 to "fire",
    815 to "fire",
    816 to "water",
    817 to "water",
    818 to "water",
    819 to "normal",
    820 to "normal",
    821 to "flying",
    822 to "flying",
    823 to "flying",
    824 to "bug",
    825 to "bug",
    826 to "bug",
    827 to "dark",
    828 to "dark",
    829 to "grass",
    830 to "grass",
    831 to "normal",
    832 to "normal",
    833 to "water",
    834 to "water",
    835 to "electric",
    836 to "electric",
    837 to "rock",
    838 to "rock",
    839 to "rock",
    840 to "grass",
    841 to "grass",
    842 to "grass",
    843 to "ground",
    844 to "ground",
    845 to "flying",
    846 to "water",
    847 to "water",
    848 to "electric",
    849 to "electric",
    850 to "fire",
    851 to "fire",
    852 to "fighting",
    853 to "fighting",
    854 to "ghost",
    855 to "ghost",
    856 to "psychic",
    857 to "psychic",
    858 to "psychic",
    859 to "dark",
    860 to "dark",
    861 to "dark",
    862 to "dark",
    863 to "steel",
    864 to "ghost",
    865 to "fighting",
    866 to "ice",
    867 to "ground",
    868 to "fairy",
    869 to "fairy",
    870 to "fighting",
    871 to "electric",
    872 to "ice",
    873 to "ice",
    874 to "rock",
    875 to "ice",
    876 to "psychic",
    877 to "electric",
    878 to "steel",
    879 to "steel",
    880 to "electric",
    881 to "electric",
    882 to "water",
    883 to "water",
    884 to "steel",
    885 to "dragon",
    886 to "dragon",
    887 to "dragon",
    888 to "fairy",
    889 to "fighting",
    890 to "poison",
    891 to "fighting",
    892 to "fighting",
    893 to "dark",
    894 to "electric",
    895 to "dragon",
    896 to "ice",
    897 to "ghost",
    898 to "psychic"
)