package com.achmadhadikurnia.kanekesteam;

import java.util.ArrayList;

public class TeamData {
    public static String[][] data = new String[][]{
            {"Achmad Hadi Kurnia", "CEO", "https://scontent.fsub8-1.fna.fbcdn.net/v/t1.0-0/c99.0.395.395a/p526x395/50951913_1929093613885757_3170690186715594752_n.jpg?_nc_cat=104&_nc_oc=AQlIOy941nQN1Zo0O70MVBigt2oCqaI50L1UUZ6h6Tkg1bbI5drvBI5YEqJRshmRwDw&_nc_ht=scontent.fsub8-1.fna&oh=486ab51c23085443ede2652366b40df4&oe=5E151C9D", "test1@gmail.com"},
            {"Zaini Fitri", "Vice", "https://instagram.fsub8-1.fna.fbcdn.net/vp/0e674e9b25d00676b689273207e68eb9/5DDFCD0F/t51.2885-19/s150x150/66491467_892068791127830_3690391893935390720_n.jpg?_nc_ht=instagram.fsub8-1.fna.fbcdn.net&_nc_cat=102", "test2@gmail.com"},
            {"M. Agung Cahyani", "CTO", "https://scontent.fsub8-1.fna.fbcdn.net/v/t1.0-9/62229341_2859762820916512_7229490970708934656_n.jpg?_nc_cat=104&_nc_oc=AQnQC79pCWicr11y9dTyZt2BJ0k3P_wj2sKHReAWkDFiJCI0dnVNnCrhmdbl7zVx4fY&_nc_ht=scontent.fsub8-1.fna&oh=b4468435b1caa884fed22c6d2a130410&oe=5E0F2180", "test3@gmail.com"},
            {"Ria Amalia", "COO", "https://scontent.fsub8-1.fna.fbcdn.net/v/t1.0-9/46125902_2204321116472799_4583559853858881536_n.jpg?_nc_cat=111&_nc_oc=AQlnZThtkYsAMBGtV4kMx2TEePlM2ZvjNQgyfZU2eBDmuYHpl7oYYH3X8E7gYMRogUQ&_nc_ht=scontent.fsub8-1.fna&oh=65c5b9ba02e528690f5f81f29cb0431b&oe=5DD52354", "test4@gmail.com"},
            {"Septian", "Programmer", "https://scontent.fsub8-1.fna.fbcdn.net/v/t1.0-9/35839081_2192434167439194_6771693408810434560_n.jpg?_nc_cat=101&_nc_oc=AQm73SFCLhK24EHSLe1zoiTAGjzPfXUt-2pOVeMNPXceuoedVDbIx4VQbuZWjt4cXvE&_nc_ht=scontent.fsub8-1.fna&oh=06b12711d1ee1add67c75ff03ca8bb41&oe=5E143F09", "test5@gmail.com"},
            {"M. Agung Mujiono", "Programmer", "https://scontent.fsub8-1.fna.fbcdn.net/v/t1.0-9/23517502_10208059154516469_5514708739142520919_n.jpg?_nc_cat=110&_nc_oc=AQlw87HX1wB_vC4wjmj2Wj_uVtOounm2U2yC9fSnAHX3uJnJuM-s5qRIh91GAkT0GEI&_nc_ht=scontent.fsub8-1.fna&oh=b4d888d8af5f1ee1df8b66f07ee4d1b7&oe=5DCAB38F", "test6@gmail.com"},
            {"Sulthan Gunawan", "Desinger", "https://scontent.fsub8-1.fna.fbcdn.net/v/t1.0-9/13103450_800706756729535_5984322991829615899_n.jpg?_nc_cat=107&_nc_oc=AQkpxt2DwAeP1N8jBcK2sghf-130jqRx1HamLJdk78rI37vjtrK12uIM6AZWnmR6Oas&_nc_ht=scontent.fsub8-1.fna&oh=782e435a97cb483d759aff01a1126d4c&oe=5DE1DDC6", "test7@gmail.com"},
            {"Ferry Mulya R.", "Designer", "https://scontent.fsub8-1.fna.fbcdn.net/v/t1.0-9/60965423_142128670281403_9180600862735597568_n.jpg?_nc_cat=102&_nc_oc=AQk4WU_EV1JbdOnaDX6Nf8ojxu_f7fw7pHrR68LqQZoaMyKOgq1dUqexWqg9k82RHAI&_nc_ht=scontent.fsub8-1.fna&oh=a4c6a7ed4fc17e173b16a44f84da8f19&oe=5DCDCD48", "test8@gmail.com"},
            {"Emma Karomah", "Marketing", "https://scontent.fsub8-1.fna.fbcdn.net/v/t1.0-9/26239695_10211258149751941_1857421284376425603_n.jpg?_nc_cat=106&_nc_oc=AQmF4PKQfUGzgrPLK9poOkXSkKV5l1nda2N3ZBf54k6In_eNJmDS-7h1eDgEcF-P4wo&_nc_ht=scontent.fsub8-1.fna&oh=b8b7a7e364c37a556318878254717c53&oe=5DD0A9EC", "test9@gmail.com"},
            {"Shely Septiani", "Marketing", "https://scontent.fsub8-1.fna.fbcdn.net/v/t1.0-9/66527765_10212395228990511_8706675960633622528_n.jpg?_nc_cat=100&_nc_oc=AQlvkHEool8IK5NAAqGRq5CNdzsDeIExui8F1A7fh_N-yfrIQnxqHgvg6CYoojxq5n4&_nc_ht=scontent.fsub8-1.fna&oh=8e702cbb4b93a45cc7232dd5d606021b&oe=5DD6FC41", "test10@gmail.com"},
            {"Kurniawan", "Marketing", "https://scontent.fsub8-1.fna.fbcdn.net/v/t1.0-9/67318483_2347074052231480_6946657633281507328_n.jpg?_nc_cat=103&_nc_oc=AQlwjYUSHqGiRK6laOrkyuHDjgxzu7sSxqRi2EXDv2pqU1beTA3jKXH4lI_USSFVwiY&_nc_ht=scontent.fsub8-1.fna&oh=ec4763c40ce0677948ecb2694bccc7ad&oe=5DDFE6E2", "test11@gmail.com"},
            {"Andi Riza", "Marketing", "https://scontent.fsub8-1.fna.fbcdn.net/v/t1.0-9/61839113_10218724189446728_3876555438904311808_n.jpg?_nc_cat=101&_nc_oc=AQl6Hq-t4T4P3gCgxStGEKB_lwDt5Cnb0mV0wOYsrlZU3l7EIlbF8z2hlsW5H0PWEgI&_nc_ht=scontent.fsub8-1.fna&oh=a6135297442ad6cbbeea3cca9a978590&oe=5DCB8BA5", "test12@gmail.com"},
    };

    public static ArrayList<Team> getListData() {
        ArrayList<Team> list = new ArrayList<>();
        for (String[] aData : data) {
            Team team = new Team();
            team.setName(aData[0]);
            team.setJob(aData[1]);
            team.setPhoto(aData[2]);
            team.setEmail(aData[3]);
            list.add(team);
        }
        return list;
    }
}
