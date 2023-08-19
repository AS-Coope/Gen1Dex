package com.example.genonedex.data

import com.example.genonedex.R
import com.example.genonedex.model.DexEntry
import com.example.genonedex.model.DexScrollEntry

class DexDataSource {

    // formats the data to be presented on the Recycler View
    fun loadScrollEntry(): List<DexScrollEntry>{
        return listOf(
            DexScrollEntry(R.string.bulbasaur_dex_no, R.drawable.bulbasaur_item_sprite, R.string.bulbasaur_name),
            DexScrollEntry(R.string.ivysaur_dex_no, R.drawable.ivysaur_item_sprite, R.string.ivysaur_name),
            DexScrollEntry(R.string.venusaur_dex_no, R.drawable.venusaur_item_sprite, R.string.venusaur_name),
            DexScrollEntry(R.string.charmander_dex_no, R.drawable.charmander_item_view, R.string.charmander_name),
            DexScrollEntry(R.string.charmeleon_dex_no, R.drawable.charmeleon_item_view, R.string.charmeleon_name),
            DexScrollEntry(R.string.charizard_dex_no, R.drawable.charizard_item_view, R.string.charizard_name),
            DexScrollEntry(R.string.squirtle_dex_no, R.drawable.squirtle_item_view, R.string.squirtle_name),
            DexScrollEntry(R.string.wartortle_dex_no, R.drawable.wartortle_image_view, R.string.wartortle_name),
            DexScrollEntry(R.string.blastoise_dex_no, R.drawable.blastoise_item_view, R.string.blastoise_name),
            DexScrollEntry(R.string.caterpie_dex_no, R.drawable.caterpie_item_view, R.string.caterpie_name),
            DexScrollEntry(R.string.metapod_dex_no, R.drawable.metapod_item_view, R.string.metapod_name),
            DexScrollEntry(R.string.butterfree_dex_no, R.drawable.butterfree_item_view, R.string.butterfree_name),
            DexScrollEntry(R.string.weedle_dex_no, R.drawable.weedle_item_view, R.string.weedle_name),
            DexScrollEntry(R.string.kakuna_dex_no, R.drawable.kakuna_item_view, R.string.kakuna_name),
            DexScrollEntry(R.string.beedrill_dex_no, R.drawable.beedrill_item_view, R.string.beedrill_name),
            DexScrollEntry(R.string.pidgey_dex_no, R.drawable.pidgey_item_view, R.string.pidgey_name),
            DexScrollEntry(R.string.pidgeotto_dex_no, R.drawable.pidgeotto_item_view, R.string.pidgeotto_name),
            DexScrollEntry(R.string.pidgeot_dex_no, R.drawable.pidgeot_item_view, R.string.pidgeot_name),
            DexScrollEntry(R.string.rattata_dex_no, R.drawable.rattata_item_view, R.string.rattata_name),
            DexScrollEntry(R.string.raticate_dex_no, R.drawable.raticate_item_view, R.string.raticate_name),
            DexScrollEntry(R.string.spearow_dex_no, R.drawable.spearow_item_view, R.string.spearow_name),
            DexScrollEntry(R.string.fearow_dex_no, R.drawable.fearow_item_view, R.string.fearow_name),
            DexScrollEntry(R.string.ekans_dex_no, R.drawable.ekans_item_view, R.string.ekans_name),
            DexScrollEntry(R.string.arbok_dex_no, R.drawable.arbok_item_view, R.string.arbok_name),
            DexScrollEntry(R.string.pikachu_dex_no, R.drawable.pikachu_item_view, R.string.pikachu_name),
            DexScrollEntry(R.string.raichu_dex_no, R.drawable.raichu_item_view, R.string.raichu_name),
            DexScrollEntry(R.string.sandshrew_dex_no, R.drawable.sandshrew_item_view, R.string.sandshrew_name),
            DexScrollEntry(R.string.sandslash_dex_no, R.drawable.sandslash_item_view, R.string.sandslash_name),
            DexScrollEntry(R.string.nidoran_female_dex_no, R.drawable.nidoran_f_item_view, R.string.nidoran_female_name),
            DexScrollEntry(R.string.nidorina_dex_no, R.drawable.nidorina_item_view, R.string.nidorina_name),
            DexScrollEntry(R.string.nidoqueen_dex_no, R.drawable.nidoqueen_item_view, R.string.nidoqueen_name),
            DexScrollEntry(R.string.nidoran_male_dex_no, R.drawable.nidoran_m_item_view, R.string.nidoran_male_name),
            DexScrollEntry(R.string.nidorino_dex_no, R.drawable.nidorino_item_view, R.string.nidorino_name),
            DexScrollEntry(R.string.nidoking_dex_no, R.drawable.nidoking_item_view, R.string.nidoking_name),
            DexScrollEntry(R.string.clefairy_dex_no, R.drawable.clefairy_item_view, R.string.clefairy_name),
            DexScrollEntry(R.string.clefable_dex_no, R.drawable.clefable_item_view, R.string.clefable_name),
            DexScrollEntry(R.string.vulpix_dex_no, R.drawable.vulpix_item_view, R.string.vulpix_name),
            DexScrollEntry(R.string.ninetales_dex_no, R.drawable.ninetales_item_view, R.string.ninetales_name),
            DexScrollEntry(R.string.jigglypuff_dex_no, R.drawable.jigglypuff_item_view, R.string.jigglypuff_name),
            DexScrollEntry(R.string.wigglytuff_dex_no, R.drawable.wigglytuff_item_view, R.string.wigglytuff_name),
            DexScrollEntry(R.string.zubat_dex_no, R.drawable.zubat_item_view, R.string.zubat_name),
            DexScrollEntry(R.string.golbat_dex_no, R.drawable.golbat_item_view, R.string.golbat_name),
            DexScrollEntry(R.string.oddish_dex_no, R.drawable.oddish_item_view, R.string.oddish_name),
            DexScrollEntry(R.string.gloom_dex_no, R.drawable.gloom_item_view, R.string.gloom_name),
            DexScrollEntry(R.string.vileplume_dex_no, R.drawable.vileplume_item_view, R.string.vileplume_name),
            DexScrollEntry(R.string.paras_dex_no, R.drawable.paras_item_view, R.string.paras_name),
            DexScrollEntry(R.string.parasect_dex_no, R.drawable.parasect_item_view, R.string.parasect_name),
            DexScrollEntry(R.string.venonat_dex_no, R.drawable.venonat_item_view, R.string.venonat_name),
            DexScrollEntry(R.string.venomoth_dex_no, R.drawable.venomoth_item_view, R.string.venomoth_name),
            DexScrollEntry(R.string.diglett_dex_no, R.drawable.diglett_item_view, R.string.diglett_name),
            DexScrollEntry(R.string.dugtrio_dex_no, R.drawable.dugtrio_item_view, R.string.dugtrio_name),
            DexScrollEntry(R.string.meowth_dex_no, R.drawable.meowth_item_view, R.string.meowth_name),
            DexScrollEntry(R.string.persian_dex_no, R.drawable.persian_item_view, R.string.persian_name),
            DexScrollEntry(R.string.psyduck_dex_no, R.drawable.psyduck_item_view, R.string.psyduck_name),
            DexScrollEntry(R.string.golduck_dex_no, R.drawable.golduck_item_view, R.string.golduck_name),
            DexScrollEntry(R.string.mankey_dex_no, R.drawable.mankey_item_view, R.string.mankey_name),
            DexScrollEntry(R.string.primeape_dex_no, R.drawable.primeape_item_view, R.string.primeape_name),
            DexScrollEntry(R.string.growlithe_dex_no, R.drawable.growlithe_item_view, R.string.growlithe_name),
            DexScrollEntry(R.string.arcanine_dex_no, R.drawable.arcanine_item_view, R.string.arcanine_name),
            DexScrollEntry(R.string.poliwag_dex_no, R.drawable.poliwag_item_view, R.string.poliwag_name),
            DexScrollEntry(R.string.poliwhirl_dex_no, R.drawable.poliwhirl_item_view, R.string.poliwhirl_name),
            DexScrollEntry(R.string.poliwrath_dex_no, R.drawable.poliwrath_item_view, R.string.poliwrath_name),
            DexScrollEntry(R.string.abra_dex_no, R.drawable.abra_item_view, R.string.abra_name),
            DexScrollEntry(R.string.kadabra_dex_no, R.drawable.kadabra_item_view, R.string.kadabra_name),
            DexScrollEntry(R.string.alakazam_dex_no, R.drawable.alakazam_item_view, R.string.alakazam_name),
            DexScrollEntry(R.string.machop_dex_no, R.drawable.machop_item_view, R.string.machop_name),
            DexScrollEntry(R.string.machoke_dex_no, R.drawable.machoke_item_view, R.string.machoke_name),
            DexScrollEntry(R.string.machamp_dex_no, R.drawable.machamp_item_view, R.string.machamp_name),
            DexScrollEntry(R.string.bellsprout_dex_no, R.drawable.bellsprout_item_view, R.string.bellsprout_name),
            DexScrollEntry(R.string.weepinbell_dex_no, R.drawable.weepinbell_item_view, R.string.weepinbell_name),
            DexScrollEntry(R.string.victreebel_dex_no, R.drawable.victreebel_item_view, R.string.victreebel_name),
            DexScrollEntry(R.string.tentacool_dex_no, R.drawable.tentacool_item_view, R.string.tentacool_name),
            DexScrollEntry(R.string.tentacruel_dex_no, R.drawable.tentacruel_item_view, R.string.tentacruel_name),
            DexScrollEntry(R.string.geodude_dex_no, R.drawable.geodude_item_view, R.string.geodude_name),
            DexScrollEntry(R.string.graveler_dex_no, R.drawable.graveler_item_view, R.string.graveler_name),
            DexScrollEntry(R.string.golem_dex_no, R.drawable.golem_item_view, R.string.golem_name),
            DexScrollEntry(R.string.ponyta_dex_no, R.drawable.ponyta_item_view, R.string.ponyta_name),
            DexScrollEntry(R.string.rapidash_dex_no, R.drawable.rapidash_item_view, R.string.rapidash_name),
            DexScrollEntry(R.string.slowpoke_dex_no, R.drawable.slowpoke_item_view, R.string.slowpoke_name),
            DexScrollEntry(R.string.slowbro_dex_no, R.drawable.slowbro_item_view, R.string.slowbro_name),
            DexScrollEntry(R.string.magnemite_dex_no, R.drawable.magnemite_item_view, R.string.magnemite_name),
            DexScrollEntry(R.string.magneton_dex_no, R.drawable.magneton_item_view, R.string.magneton_name),
            DexScrollEntry(R.string.farfetchd_dex_no, R.drawable.farfetchd_item_view, R.string.farfetchd_name),
            DexScrollEntry(R.string.doduo_dex_no, R.drawable.doduo_item_view, R.string.doduo_name),
            DexScrollEntry(R.string.dodrio_dex_no, R.drawable.dodrio_item_view, R.string.dodrio_name),
            DexScrollEntry(R.string.seel_dex_no, R.drawable.seel_item_view, R.string.seel_name),
            DexScrollEntry(R.string.dewgong_dex_no, R.drawable.dewgong_item_view, R.string.dewgong_name),
            DexScrollEntry(R.string.grimer_dex_no, R.drawable.grimer_item_view, R.string.grimer_name),
            DexScrollEntry(R.string.muk_dex_no, R.drawable.muk_item_view, R.string.muk_name),
            DexScrollEntry(R.string.shellder_dex_no, R.drawable.shellder_item_view, R.string.shellder_name),
            DexScrollEntry(R.string.cloyster_dex_no, R.drawable.cloyster_item_view, R.string.cloyster_name),
            DexScrollEntry(R.string.gastly_dex_no, R.drawable.gastly_item_view, R.string.gastly_name),
            DexScrollEntry(R.string.haunter_dex_no, R.drawable.haunter_item_view, R.string.haunter_name),
            DexScrollEntry(R.string.gengar_dex_no, R.drawable.gengar_item_view, R.string.gengar_name),
            DexScrollEntry(R.string.onix_dex_no, R.drawable.onix_item_view, R.string.onix_name),
            DexScrollEntry(R.string.drowzee_dex_no, R.drawable.drowzee_item_view, R.string.drowzee_name),
            DexScrollEntry(R.string.hypno_dex_no, R.drawable.hypno_item_view, R.string.hypno_name),
            DexScrollEntry(R.string.krabby_dex_no, R.drawable.krabby_item_view, R.string.krabby_name),
            DexScrollEntry(R.string.kingler_dex_no, R.drawable.kingler_item_view, R.string.kingler_name),
            DexScrollEntry(R.string.voltorb_dex_no, R.drawable.voltorb_item_view, R.string.voltorb_name),
            DexScrollEntry(R.string.electrode_dex_no, R.drawable.electrode_item_view, R.string.electrode_name),
            DexScrollEntry(R.string.exeggcute_dex_no, R.drawable.exeggcute_item_view, R.string.exeggcute_name),
            DexScrollEntry(R.string.exeggutor_dex_no, R.drawable.exeggutor_item_view, R.string.exeggutor_name),
            DexScrollEntry(R.string.cubone_dex_no, R.drawable.cubone_item_view, R.string.cubone_name),
            DexScrollEntry(R.string.marowak_dex_no, R.drawable.marowak_item_view, R.string.marowak_name),
            DexScrollEntry(R.string.hitmonlee_dex_no, R.drawable.hitmonlee_item_view, R.string.hitmonlee_name),
            DexScrollEntry(R.string.hitmonchan_dex_no, R.drawable.hitmonchan_item_view, R.string.hitmonchan_name),
            DexScrollEntry(R.string.lickitung_dex_no, R.drawable.lickitung_item_view, R.string.lickitung_name),
            DexScrollEntry(R.string.koffing_dex_no, R.drawable.koffing_item_view, R.string.koffing_name),
            DexScrollEntry(R.string.weezing_dex_no, R.drawable.weezing_item_view, R.string.weezing_name),
            DexScrollEntry(R.string.rhyhorn_dex_no, R.drawable.rhyhorn_item_view, R.string.rhyhorn_name),
            DexScrollEntry(R.string.rhydon_dex_no, R.drawable.rhydon_item_view, R.string.rhydon_name),
            DexScrollEntry(R.string.chansey_dex_no, R.drawable.chansey_item_view, R.string.chansey_name),
            DexScrollEntry(R.string.tangela_dex_no, R.drawable.tangela_item_view, R.string.tangela_name),
            DexScrollEntry(R.string.kangaskhan_dex_no, R.drawable.kangaskhan_item_view, R.string.kangaskhan_name),
            DexScrollEntry(R.string.horsea_dex_no, R.drawable.horsea_item_view, R.string.horsea_name),
            DexScrollEntry(R.string.seadra_dex_no, R.drawable.seadra_item_view, R.string.seadra_name),
            DexScrollEntry(R.string.goldeen_dex_no, R.drawable.goldeen_item_view, R.string.goldeen_name),
            DexScrollEntry(R.string.seaking_dex_no, R.drawable.seaking_item_view, R.string.seaking_name)
        )
    }

    // formats the data to be presented in the description entry page
    fun loadDescEntry(): List<DexEntry>{
        return listOf(
            ////////// 1 - 3
            DexEntry(
                R.string.bulbasaur_dex_no, R.drawable.bulbasaur_item_sprite, R.string.bulbasaur_name, R.string.bulbasaur_species,R.string.bulbasaur_desc, R.string.bulbasaur_weight, R.string.bulbasaur_height, R.string.type_grass, R.string.type_poison
            ),
            DexEntry(
                R.string.ivysaur_dex_no, R.drawable.ivysaur_item_sprite, R.string.ivysaur_name, R.string.ivysaur_species,R.string.ivysaur_desc, R.string.ivysaur_weight, R.string.ivysaur_height, R.string.type_grass, R.string.type_poison
            ),
            DexEntry(
                R.string.venusaur_dex_no, R.drawable.venusaur_item_sprite, R.string.venusaur_name, R.string.venusaur_species,R.string.venusaur_desc, R.string.venusaur_weight, R.string.venusaur_height, R.string.type_grass, R.string.type_poison
            ),
            ////////// 4 - 6
            DexEntry(
                R.string.charmander_dex_no, R.drawable.charmander_item_view, R.string.charmander_name, R.string.charmander_species,R.string.charmander_desc, R.string.charmander_weight, R.string.charmander_height, R.string.type_fire, R.string.no_type_2
            ),
            DexEntry(
                R.string.charmeleon_dex_no, R.drawable.charmeleon_item_view, R.string.charmeleon_name, R.string.charmeleon_species,R.string.charmeleon_desc, R.string.charmeleon_weight, R.string.charmeleon_height, R.string.type_fire, R.string.no_type_2
            ),
            DexEntry(
                R.string.charizard_dex_no, R.drawable.charizard_item_view, R.string.charizard_name, R.string.charizard_species,R.string.charizard_desc, R.string.charizard_weight, R.string.charizard_height, R.string.type_fire, R.string.type_flying
            ),
            /////////// 7 - 9
            DexEntry(
                R.string.squirtle_dex_no, R.drawable.squirtle_item_view, R.string.squirtle_name, R.string.squirtle_species,R.string.squirtle_desc, R.string.squirtle_weight, R.string.squirtle_height, R.string.type_water, R.string.no_type_2
            ),
            DexEntry(
                R.string.wartortle_dex_no, R.drawable.wartortle_image_view, R.string.wartortle_name, R.string.wartortle_species,R.string.wartortle_desc, R.string.wartortle_weight, R.string.wartortle_height, R.string.type_water, R.string.no_type_2
            ),
            DexEntry(
                R.string.blastoise_dex_no, R.drawable.blastoise_item_view, R.string.blastoise_name, R.string.blastoise_species,R.string.blastoise_desc, R.string.blastoise_weight, R.string.blastoise_height, R.string.type_water, R.string.no_type_2
            ),

            /////////// 10 - 12
            DexEntry(
                R.string.caterpie_dex_no, R.drawable.caterpie_item_view, R.string.caterpie_name, R.string.caterpie_species,R.string.caterpie_desc, R.string.caterpie_weight, R.string.caterpie_height, R.string.type_bug, R.string.no_type_2
            ),
            DexEntry(
                R.string.metapod_dex_no, R.drawable.metapod_item_view, R.string.metapod_name, R.string.metapod_species,R.string.metapod_desc, R.string.metapod_weight, R.string.metapod_height, R.string.type_bug, R.string.no_type_2
            ),
            DexEntry(
                R.string.butterfree_dex_no, R.drawable.butterfree_item_view, R.string.butterfree_name, R.string.butterfree_species,R.string.butterfree_desc, R.string.butterfree_weight, R.string.butterfree_height, R.string.type_bug, R.string.type_flying
            ),

            /////////// 13 - 15
            DexEntry(
                R.string.weedle_dex_no, R.drawable.weedle_item_view, R.string.weedle_name, R.string.weedle_species,R.string.weedle_desc, R.string.weedle_weight, R.string.weedle_height, R.string.type_bug, R.string.type_poison
            ),
            DexEntry(
                R.string.kakuna_dex_no, R.drawable.kakuna_item_view, R.string.kakuna_name, R.string.kakuna_species,R.string.kakuna_desc, R.string.kakuna_weight, R.string.kakuna_height, R.string.type_bug, R.string.type_poison
            ),
            DexEntry(
                R.string.beedrill_dex_no, R.drawable.beedrill_item_view, R.string.beedrill_name, R.string.beedrill_species,R.string.beedrill_desc, R.string.beedrill_weight, R.string.beedrill_height, R.string.type_bug, R.string.type_poison
            ),

            /////////// 16 - 18
            DexEntry(
                R.string.pidgey_dex_no, R.drawable.pidgey_item_view, R.string.pidgey_name, R.string.pidgey_species,R.string.pidgey_desc, R.string.pidgey_weight, R.string.pidgey_height, R.string.type_normal, R.string.type_flying
            ),
            DexEntry(
                R.string.pidgeotto_dex_no, R.drawable.pidgeotto_item_view, R.string.pidgeotto_name, R.string.pidgeotto_species,R.string.pidgeotto_desc, R.string.pidgeotto_weight, R.string.pidgeotto_height, R.string.type_normal, R.string.type_flying
            ),
            DexEntry(
                R.string.pidgeot_dex_no, R.drawable.pidgeot_item_view, R.string.pidgeot_name, R.string.pidgeot_species,R.string.pidgeot_desc, R.string.pidgeot_weight, R.string.pidgeot_height, R.string.type_normal, R.string.type_flying
            ),

            /////////// 19 - 20
            DexEntry(
                R.string.rattata_dex_no, R.drawable.rattata_item_view, R.string.rattata_name, R.string.rattata_species,R.string.rattata_desc, R.string.rattata_weight, R.string.rattata_height, R.string.type_normal, R.string.no_type_2
            ),
            DexEntry(
                R.string.raticate_dex_no, R.drawable.raticate_item_view, R.string.raticate_name, R.string.raticate_species,R.string.raticate_desc, R.string.raticate_weight, R.string.raticate_height, R.string.type_normal, R.string.no_type_2
            ),

            /////////// 21 - 22
            DexEntry(
                R.string.spearow_dex_no, R.drawable.spearow_item_view, R.string.spearow_name, R.string.spearow_species,R.string.spearow_desc, R.string.spearow_weight, R.string.spearow_height, R.string.type_normal, R.string.type_flying
            ),
            DexEntry(
                R.string.fearow_dex_no, R.drawable.fearow_item_view, R.string.fearow_name, R.string.fearow_species,R.string.fearow_desc, R.string.fearow_weight, R.string.fearow_height, R.string.type_normal, R.string.type_flying
            ),

            /////////// 23 - 24
            DexEntry(
                R.string.ekans_dex_no, R.drawable.ekans_item_view, R.string.ekans_name, R.string.ekans_species,R.string.ekans_desc, R.string.ekans_weight, R.string.ekans_height, R.string.type_poison, R.string.no_type_2
            ),
            DexEntry(
                R.string.arbok_dex_no, R.drawable.arbok_item_view, R.string.arbok_name, R.string.arbok_species,R.string.arbok_desc, R.string.arbok_weight, R.string.arbok_height, R.string.type_poison, R.string.no_type_2
            ),

            /////////// 25 - 26
            DexEntry(
                R.string.pikachu_dex_no, R.drawable.pikachu_item_view, R.string.pikachu_name, R.string.pikachu_species,R.string.pikachu_desc, R.string.pikachu_weight, R.string.pikachu_height, R.string.type_electric, R.string.no_type_2
            ),
            DexEntry(
                R.string.raichu_dex_no, R.drawable.raichu_item_view, R.string.raichu_name, R.string.raichu_species,R.string.raichu_desc, R.string.raichu_weight, R.string.raichu_height, R.string.type_electric, R.string.no_type_2
            ),

            /////////// 27 - 28
            DexEntry(
                R.string.sandshrew_dex_no, R.drawable.sandshrew_item_view, R.string.sandshrew_name, R.string.sandshrew_species,R.string.sandshrew_desc, R.string.sandshrew_weight, R.string.sandshrew_height, R.string.type_ground, R.string.no_type_2
            ),
            DexEntry(
                R.string.sandslash_dex_no, R.drawable.sandslash_item_view, R.string.sandslash_name, R.string.sandslash_species,R.string.sandslash_desc, R.string.sandslash_weight, R.string.sandslash_height, R.string.type_ground, R.string.no_type_2
            ),

            /////////// 29 - 31
            DexEntry(
                R.string.nidoran_female_dex_no, R.drawable.nidoran_f_item_view, R.string.nidoran_female_name, R.string.nidoran_female_species,R.string.nidoran_female_desc, R.string.nidoran_female_weight, R.string.nidoran_female_height, R.string.type_poison, R.string.no_type_2
            ),
            DexEntry(
                R.string.nidorina_dex_no, R.drawable.nidorina_item_view, R.string.nidorina_name, R.string.nidorina_species,R.string.nidorina_desc, R.string.nidorina_weight, R.string.nidorina_height, R.string.type_poison, R.string.no_type_2
            ),
            DexEntry(
                R.string.nidoqueen_dex_no, R.drawable.nidoqueen_item_view, R.string.nidoqueen_name, R.string.nidoqueen_species,R.string.nidoqueen_desc, R.string.nidoqueen_weight, R.string.nidoqueen_height, R.string.type_poison, R.string.type_ground
            ),

            /////////// 32 - 34
            DexEntry(
                R.string.nidoran_male_dex_no, R.drawable.nidoran_m_item_view, R.string.nidoran_male_name, R.string.nidoran_male_species,R.string.nidoran_male_desc, R.string.nidoran_male_weight, R.string.nidoran_male_height, R.string.type_poison, R.string.no_type_2
            ),
            DexEntry(
                R.string.nidorino_dex_no, R.drawable.nidorino_item_view, R.string.nidorino_name, R.string.nidorino_species,R.string.nidorino_desc, R.string.nidorino_weight, R.string.nidorino_height, R.string.type_poison, R.string.no_type_2
            ),
            DexEntry(
                R.string.nidoking_dex_no, R.drawable.nidoking_item_view, R.string.nidoking_name, R.string.nidoking_species,R.string.nidoking_desc, R.string.nidoking_weight, R.string.nidoking_height, R.string.type_poison, R.string.type_ground
            )
        )
    }
}