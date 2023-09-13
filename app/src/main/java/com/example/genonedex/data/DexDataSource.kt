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
            DexScrollEntry(R.string.seaking_dex_no, R.drawable.seaking_item_view, R.string.seaking_name),
            DexScrollEntry(R.string.staryu_dex_no, R.drawable.staryu_item_view, R.string.staryu_name),
            DexScrollEntry(R.string.starmie_dex_no, R.drawable.starmie_item_view, R.string.starmie_name),
            DexScrollEntry(R.string.mr_mime_dex_no, R.drawable.mr_mime_item_view, R.string.mr_mime_name),
            DexScrollEntry(R.string.scyther_dex_no, R.drawable.scyther_item_view, R.string.scyther_name),
            DexScrollEntry(R.string.jynx_dex_no, R.drawable.jynx_item_view, R.string.jynx_name),
            DexScrollEntry(R.string.electabuzz_dex_no, R.drawable.electabuzz_item_view, R.string.electabuzz_name),
            DexScrollEntry(R.string.magmar_dex_no, R.drawable.magmar_item_view, R.string.magmar_name),
            DexScrollEntry(R.string.pinsir_dex_no, R.drawable.pinsir_item_view, R.string.pinsir_name),
            DexScrollEntry(R.string.tauros_dex_no, R.drawable.tauros_item_view, R.string.tauros_name),
            DexScrollEntry(R.string.magikarp_dex_no, R.drawable.magikarp_item_view, R.string.magikarp_name),
            DexScrollEntry(R.string.gyarados_dex_no, R.drawable.gyarados_item_view, R.string.gyarados_name),
            DexScrollEntry(R.string.lapras_dex_no, R.drawable.lapras_item_view, R.string.lapras_name),
            DexScrollEntry(R.string.ditto_dex_no, R.drawable.ditto_item_view, R.string.ditto_name),
            DexScrollEntry(R.string.eevee_dex_no, R.drawable.eevee_item_view, R.string.eevee_name),
            DexScrollEntry(R.string.vaporeon_dex_no, R.drawable.vaporeon_item_view, R.string.vaporeon_name),
            DexScrollEntry(R.string.jolteon_dex_no, R.drawable.jolteon_item_view, R.string.jolteon_name),
            DexScrollEntry(R.string.flareon_dex_no, R.drawable.flareon_item_view, R.string.flareon_name),
            DexScrollEntry(R.string.porygon_dex_no, R.drawable.porygon_item_view, R.string.porygon_name),
            DexScrollEntry(R.string.omanyte_dex_no, R.drawable.omanyte_item_view, R.string.omanyte_name),
            DexScrollEntry(R.string.omastar_dex_no, R.drawable.omastar_item_view, R.string.omastar_name),
            DexScrollEntry(R.string.kabuto_dex_no, R.drawable.kabuto_item_view, R.string.kabuto_name),
            DexScrollEntry(R.string.kabutops_dex_no, R.drawable.kabutops_item_view, R.string.kabutops_name),
            DexScrollEntry(R.string.aerodactyl_dex_no, R.drawable.aerodactyl_item_view, R.string.aerodactyl_name),
            DexScrollEntry(R.string.snorlax_dex_no, R.drawable.snorlax_item_view, R.string.snorlax_name),
            DexScrollEntry(R.string.articuno_dex_no, R.drawable.articuno_item_view, R.string.articuno_name),
            DexScrollEntry(R.string.zapdos_dex_no, R.drawable.zapdos_item_view, R.string.zapdos_name),
            DexScrollEntry(R.string.moltres_dex_no, R.drawable.moltres_item_view, R.string.moltres_name),
            DexScrollEntry(R.string.dratini_dex_no, R.drawable.dratini_item_view, R.string.dratini_name),
            DexScrollEntry(R.string.dragonair_dex_no, R.drawable.dragonair_item_view, R.string.dragonair_name),
            DexScrollEntry(R.string.dragonite_dex_no, R.drawable.dragonite_item_view, R.string.dragonite_name),
            DexScrollEntry(R.string.mewtwo_dex_no, R.drawable.mewtwo_item_view, R.string.mewtwo_name),
            DexScrollEntry(R.string.mew_dex_no, R.drawable.mew_item_view, R.string.mew_name)
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
            ),

            /////////// 35 - 36
            DexEntry(
                R.string.clefairy_dex_no, R.drawable.clefairy_item_view, R.string.clefairy_name, R.string.clefairy_species,R.string.clefairy_desc, R.string.clefairy_weight, R.string.clefairy_height, R.string.type_normal, R.string.no_type_2
            ),
            DexEntry(
                R.string.clefable_dex_no, R.drawable.clefable_item_view, R.string.clefable_name, R.string.clefable_species,R.string.clefable_desc, R.string.clefable_weight, R.string.clefable_height, R.string.type_normal, R.string.no_type_2
            ),

            /////////// 37 - 38
            DexEntry(
                R.string.vulpix_dex_no, R.drawable.vulpix_item_view, R.string.vulpix_name, R.string.vulpix_species,R.string.vulpix_desc, R.string.vulpix_weight, R.string.vulpix_height, R.string.type_fire, R.string.no_type_2
            ),
            DexEntry(
                R.string.ninetales_dex_no, R.drawable.ninetales_item_view, R.string.ninetales_name, R.string.ninetales_species,R.string.ninetales_desc, R.string.ninetales_weight, R.string.ninetales_height, R.string.type_fire, R.string.no_type_2
            ),

            /////////// 39 - 40
            DexEntry(
                R.string.jigglypuff_dex_no, R.drawable.jigglypuff_item_view, R.string.jigglypuff_name, R.string.jigglypuff_species,R.string.jigglypuff_desc, R.string.jigglypuff_weight, R.string.jigglypuff_height, R.string.type_normal, R.string.no_type_2
            ),
            DexEntry(
                R.string.wigglytuff_dex_no, R.drawable.wigglytuff_item_view, R.string.wigglytuff_name, R.string.wigglytuff_species,R.string.wigglytuff_desc, R.string.wigglytuff_weight, R.string.wigglytuff_height, R.string.type_normal, R.string.no_type_2
            ),

            /////////// 41 - 42
            DexEntry(
                R.string.zubat_dex_no, R.drawable.zubat_item_view, R.string.zubat_name, R.string.zubat_species,R.string.zubat_desc, R.string.zubat_weight, R.string.zubat_height, R.string.type_poison, R.string.type_flying
            ),
            DexEntry(
                R.string.golbat_dex_no, R.drawable.golbat_item_view, R.string.golbat_name, R.string.golbat_species,R.string.golbat_desc, R.string.golbat_weight, R.string.golbat_height, R.string.type_normal, R.string.type_flying
            ),

            /////////// 43 - 45
            DexEntry(
                R.string.oddish_dex_no, R.drawable.oddish_item_view, R.string.oddish_name, R.string.oddish_species,R.string.oddish_desc, R.string.oddish_weight, R.string.oddish_height, R.string.type_grass, R.string.type_poison
            ),
            DexEntry(
                R.string.gloom_dex_no, R.drawable.gloom_item_view, R.string.gloom_name, R.string.gloom_species,R.string.gloom_desc, R.string.gloom_weight, R.string.gloom_height, R.string.type_grass, R.string.type_poison
            ),
            DexEntry(
                R.string.vileplume_dex_no, R.drawable.vileplume_item_view, R.string.vileplume_name, R.string.vileplume_species,R.string.vileplume_desc, R.string.vileplume_weight, R.string.vileplume_height, R.string.type_grass, R.string.type_poison
            ),

            /////////// 46 - 47
            DexEntry(
                R.string.paras_dex_no, R.drawable.paras_item_view, R.string.paras_name, R.string.paras_species,R.string.paras_desc, R.string.paras_weight, R.string.paras_height, R.string.type_bug, R.string.type_grass
            ),
            DexEntry(
                R.string.parasect_dex_no, R.drawable.parasect_item_view, R.string.parasect_name, R.string.parasect_species,R.string.parasect_desc, R.string.parasect_weight, R.string.parasect_height, R.string.type_bug, R.string.type_grass
            ),

            /////////// 48 - 49
            DexEntry(
                R.string.venonat_dex_no, R.drawable.venonat_item_view, R.string.venonat_name, R.string.venonat_species,R.string.venonat_desc, R.string.venonat_weight, R.string.venonat_height, R.string.type_bug, R.string.type_poison
            ),
            DexEntry(
                R.string.venomoth_dex_no, R.drawable.venomoth_item_view, R.string.venomoth_name, R.string.venomoth_species,R.string.venomoth_desc, R.string.venomoth_weight, R.string.venomoth_height, R.string.type_bug, R.string.type_poison
            ),

            /////////// 50 - 51
            DexEntry(
                R.string.diglett_dex_no, R.drawable.diglett_item_view, R.string.diglett_name, R.string.diglett_species,R.string.diglett_desc, R.string.diglett_weight, R.string.diglett_height, R.string.type_ground, R.string.no_type_2
            ),
            DexEntry(
                R.string.dugtrio_dex_no, R.drawable.dugtrio_item_view, R.string.dugtrio_name, R.string.dugtrio_species,R.string.dugtrio_desc, R.string.dugtrio_weight, R.string.dugtrio_height, R.string.type_ground, R.string.no_type_2
            ),

            /////////// 52 - 53
            DexEntry(
                R.string.meowth_dex_no, R.drawable.meowth_item_view, R.string.meowth_name, R.string.meowth_species,R.string.meowth_desc, R.string.meowth_weight, R.string.meowth_height, R.string.type_normal, R.string.no_type_2
            ),
            DexEntry(
                R.string.persian_dex_no, R.drawable.persian_item_view, R.string.persian_name, R.string.persian_species,R.string.persian_desc, R.string.persian_weight, R.string.persian_height, R.string.type_normal, R.string.no_type_2
            ),

            /////////// 54 - 55
            DexEntry(
                R.string.psyduck_dex_no, R.drawable.psyduck_item_view, R.string.psyduck_name, R.string.psyduck_species,R.string.psyduck_desc, R.string.psyduck_weight, R.string.psyduck_height, R.string.type_water, R.string.no_type_2
            ),
            DexEntry(
                R.string.golduck_dex_no, R.drawable.golduck_item_view, R.string.golduck_name, R.string.golduck_species,R.string.golduck_desc, R.string.golduck_weight, R.string.golduck_height, R.string.type_water, R.string.no_type_2
            ),

            /////////// 56 - 57
            DexEntry(
                R.string.mankey_dex_no, R.drawable.mankey_item_view, R.string.mankey_name, R.string.mankey_species,R.string.mankey_desc, R.string.mankey_weight, R.string.mankey_height, R.string.type_fighting, R.string.no_type_2
            ),
            DexEntry(
                R.string.primeape_dex_no, R.drawable.primeape_item_view, R.string.primeape_name, R.string.primeape_species,R.string.primeape_desc, R.string.primeape_weight, R.string.primeape_height, R.string.type_fighting, R.string.no_type_2
            ),

            /////////// 58 - 59
            DexEntry(
                R.string.growlithe_dex_no, R.drawable.growlithe_item_view, R.string.growlithe_name, R.string.growlithe_species,R.string.growlithe_desc, R.string.growlithe_weight, R.string.growlithe_height, R.string.type_fire, R.string.no_type_2
            ),
            DexEntry(
                R.string.arcanine_dex_no, R.drawable.arcanine_item_view, R.string.arcanine_name, R.string.arcanine_species,R.string.arcanine_desc, R.string.arcanine_weight, R.string.arcanine_height, R.string.type_fire, R.string.no_type_2
            ),

            /////////// 60 - 62
            DexEntry(
                R.string.poliwag_dex_no, R.drawable.poliwag_item_view, R.string.poliwag_name, R.string.poliwag_species,R.string.poliwag_desc, R.string.poliwag_weight, R.string.poliwag_height, R.string.type_water, R.string.no_type_2
            ),
            DexEntry(
                R.string.poliwhirl_dex_no, R.drawable.poliwhirl_item_view, R.string.poliwhirl_name, R.string.poliwhirl_species,R.string.poliwhirl_desc, R.string.poliwhirl_weight, R.string.poliwhirl_height, R.string.type_water, R.string.no_type_2
            ),
            DexEntry(
                R.string.poliwrath_dex_no, R.drawable.poliwrath_item_view, R.string.poliwrath_name, R.string.poliwrath_species,R.string.poliwrath_desc, R.string.poliwrath_weight, R.string.poliwrath_height, R.string.type_water, R.string.type_fighting
            ),

            /////////// 63 - 65
            DexEntry(
                R.string.abra_dex_no, R.drawable.abra_item_view, R.string.abra_name, R.string.abra_species,R.string.abra_desc, R.string.abra_weight, R.string.abra_height, R.string.type_psychic, R.string.no_type_2
            ),
            DexEntry(
                R.string.kadabra_dex_no, R.drawable.kadabra_item_view, R.string.kadabra_name, R.string.kadabra_species,R.string.kadabra_desc, R.string.kadabra_weight, R.string.kadabra_height, R.string.type_psychic, R.string.no_type_2
            ),
            DexEntry(
                R.string.alakazam_dex_no, R.drawable.alakazam_item_view, R.string.alakazam_name, R.string.alakazam_species,R.string.alakazam_desc, R.string.alakazam_weight, R.string.alakazam_height, R.string.type_psychic, R.string.no_type_2
            ),

            /////////// 66 - 68
            DexEntry(
                R.string.machop_dex_no, R.drawable.machop_item_view, R.string.machop_name, R.string.machop_species,R.string.machop_desc, R.string.machop_weight, R.string.machop_height, R.string.type_fighting, R.string.no_type_2
            ),
            DexEntry(
                R.string.machoke_dex_no, R.drawable.machoke_item_view, R.string.machoke_name, R.string.machoke_species,R.string.machoke_desc, R.string.machoke_weight, R.string.machoke_height, R.string.type_fighting, R.string.no_type_2
            ),
            DexEntry(
                R.string.machamp_dex_no, R.drawable.machamp_item_view, R.string.machamp_name, R.string.machamp_species,R.string.machamp_desc, R.string.machamp_weight, R.string.machamp_height, R.string.type_fighting, R.string.no_type_2
            ),

            /////////// 69 - 71
            DexEntry(
                R.string.bellsprout_dex_no, R.drawable.bellsprout_item_view, R.string.bellsprout_name, R.string.bellsprout_species,R.string.bellsprout_desc, R.string.bellsprout_weight, R.string.bellsprout_height, R.string.type_grass, R.string.type_poison
            ),
            DexEntry(
                R.string.weepinbell_dex_no, R.drawable.weepinbell_item_view, R.string.weepinbell_name, R.string.weepinbell_species,R.string.weepinbell_desc, R.string.weepinbell_weight, R.string.weepinbell_height, R.string.type_grass, R.string.type_poison
            ),
            DexEntry(
                R.string.victreebel_dex_no, R.drawable.victreebel_item_view, R.string.victreebel_name, R.string.victreebel_species,R.string.victreebel_desc, R.string.victreebel_weight, R.string.victreebel_height, R.string.type_grass, R.string.type_poison
            ),

            /////////// 72 - 73
            DexEntry(
                R.string.tentacool_dex_no, R.drawable.tentacool_item_view, R.string.tentacool_name, R.string.tentacool_species,R.string.tentacool_desc, R.string.tentacool_weight, R.string.tentacool_height, R.string.type_water, R.string.type_poison
            ),
            DexEntry(
                R.string.tentacruel_dex_no, R.drawable.tentacruel_item_view, R.string.tentacruel_name, R.string.tentacruel_species,R.string.tentacruel_desc, R.string.tentacruel_weight, R.string.tentacruel_height, R.string.type_water, R.string.type_poison
            ),

            /////////// 74 - 76
            DexEntry(
                R.string.geodude_dex_no, R.drawable.geodude_item_view, R.string.geodude_name, R.string.geodude_species,R.string.geodude_desc, R.string.geodude_weight, R.string.geodude_height, R.string.type_rock, R.string.type_ground
            ),
            DexEntry(
                R.string.graveler_dex_no, R.drawable.graveler_item_view, R.string.graveler_name, R.string.graveler_species,R.string.graveler_desc, R.string.graveler_weight, R.string.graveler_height, R.string.type_rock, R.string.type_ground
            ),
            DexEntry(
                R.string.golem_dex_no, R.drawable.golem_item_view, R.string.golem_name, R.string.golem_species,R.string.golem_desc, R.string.golem_weight, R.string.golem_height, R.string.type_rock, R.string.type_ground
            ),

            /////////// 77 - 78
            DexEntry(
                R.string.ponyta_dex_no, R.drawable.ponyta_item_view, R.string.ponyta_name, R.string.ponyta_species,R.string.ponyta_desc, R.string.ponyta_weight, R.string.ponyta_height, R.string.type_fire, R.string.no_type_2
            ),
            DexEntry(
                R.string.rapidash_dex_no, R.drawable.rapidash_item_view, R.string.rapidash_name, R.string.rapidash_species,R.string.rapidash_desc, R.string.rapidash_weight, R.string.rapidash_height, R.string.type_fire, R.string.no_type_2
            ),

            /////////// 79 - 80
            DexEntry(
                R.string.slowpoke_dex_no, R.drawable.slowpoke_item_view, R.string.slowpoke_name, R.string.slowpoke_species,R.string.slowpoke_desc, R.string.slowpoke_weight, R.string.slowpoke_height, R.string.type_water, R.string.type_psychic
            ),
            DexEntry(
                R.string.slowbro_dex_no, R.drawable.slowbro_item_view, R.string.slowbro_name, R.string.slowbro_species,R.string.slowbro_desc, R.string.slowbro_weight, R.string.slowbro_height, R.string.type_water, R.string.type_psychic
            ),

            /////////// 81 - 82
            DexEntry(
                R.string.magnemite_dex_no, R.drawable.magnemite_item_view, R.string.magnemite_name, R.string.magnemite_species,R.string.magnemite_desc, R.string.magnemite_weight, R.string.magnemite_height, R.string.type_electric, R.string.no_type_2
            ),
            DexEntry(
                R.string.slowbro_dex_no, R.drawable.slowbro_item_view, R.string.slowbro_name, R.string.slowbro_species,R.string.slowbro_desc, R.string.slowbro_weight, R.string.slowbro_height, R.string.type_electric, R.string.no_type_2
            ),

            /////////// 83
            DexEntry(
                R.string.farfetchd_dex_no, R.drawable.farfetchd_item_view, R.string.farfetchd_name, R.string.farfetchd_species,R.string.farfetchd_desc, R.string.farfetchd_weight, R.string.farfetchd_height, R.string.type_normal, R.string.type_flying
            ),

            /////////// 84 - 85
            DexEntry(
                R.string.doduo_dex_no, R.drawable.doduo_item_view, R.string.doduo_name, R.string.doduo_species,R.string.doduo_desc, R.string.doduo_weight, R.string.doduo_height, R.string.type_normal, R.string.type_flying
            ),
            DexEntry(
                R.string.dodrio_dex_no, R.drawable.dodrio_item_view, R.string.dodrio_name, R.string.dodrio_species,R.string.dodrio_desc, R.string.dodrio_weight, R.string.dodrio_height, R.string.type_normal, R.string.type_flying
            ),

            /////////// 86 - 87
            DexEntry(
                R.string.seel_dex_no, R.drawable.seel_item_view, R.string.seel_name, R.string.seel_species,R.string.seel_desc, R.string.seel_weight, R.string.seel_height, R.string.type_water, R.string.no_type_2
            ),
            DexEntry(
                R.string.dewgong_dex_no, R.drawable.dewgong_item_view, R.string.dewgong_name, R.string.dewgong_species,R.string.dewgong_desc, R.string.dewgong_weight, R.string.dewgong_height, R.string.type_water, R.string.type_ice
            ),

            /////////// 88 - 89
            DexEntry(
                R.string.grimer_dex_no, R.drawable.grimer_item_view, R.string.grimer_name, R.string.grimer_species,R.string.grimer_desc, R.string.grimer_weight, R.string.grimer_height, R.string.type_poison, R.string.no_type_2
            ),
            DexEntry(
                R.string.muk_dex_no, R.drawable.muk_item_view, R.string.muk_name, R.string.muk_species,R.string.muk_desc, R.string.muk_weight, R.string.muk_height, R.string.type_poison, R.string.no_type_2
            ),

            /////////// 90 - 91
            DexEntry(
                R.string.shellder_dex_no, R.drawable.shellder_item_view, R.string.shellder_name, R.string.shellder_species,R.string.shellder_desc, R.string.shellder_weight, R.string.shellder_height, R.string.type_water, R.string.no_type_2
            ),
            DexEntry(
                R.string.cloyster_dex_no, R.drawable.cloyster_item_view, R.string.cloyster_name, R.string.cloyster_species,R.string.cloyster_desc, R.string.cloyster_weight, R.string.cloyster_height, R.string.type_water, R.string.type_ice
            ),

            /////////// 92 - 94
            DexEntry(
                R.string.gastly_dex_no, R.drawable.gastly_item_view, R.string.gastly_name, R.string.gastly_species,R.string.gastly_desc, R.string.gastly_weight, R.string.gastly_height, R.string.type_ghost, R.string.type_poison
            ),
            DexEntry(
                R.string.haunter_dex_no, R.drawable.haunter_item_view, R.string.haunter_name, R.string.haunter_species,R.string.haunter_desc, R.string.haunter_weight, R.string.haunter_height, R.string.type_ghost, R.string.type_poison
            ),
            DexEntry(
                R.string.gengar_dex_no, R.drawable.gengar_item_view, R.string.gengar_name, R.string.gengar_species,R.string.gengar_desc, R.string.gengar_weight, R.string.gengar_height, R.string.type_ghost, R.string.type_poison
            ),

            /////////// 95
            DexEntry(
                    R.string.onix_dex_no, R.drawable.onix_item_view, R.string.onix_name, R.string.onix_species,R.string.onix_desc, R.string.onix_weight, R.string.onix_height, R.string.type_rock, R.string.type_ground
            ),

            /////////// 96 - 97
            DexEntry(
                R.string.drowzee_dex_no, R.drawable.drowzee_item_view, R.string.drowzee_name, R.string.drowzee_species,R.string.drowzee_desc, R.string.drowzee_weight, R.string.drowzee_height, R.string.type_psychic, R.string.no_type_2
            ),
            DexEntry(
                R.string.hypno_dex_no, R.drawable.hypno_item_view, R.string.hypno_name, R.string.hypno_species,R.string.hypno_desc, R.string.hypno_weight, R.string.hypno_height, R.string.type_psychic, R.string.no_type_2
            ),

            /////////// 98 - 99
            DexEntry(
                R.string.krabby_dex_no, R.drawable.krabby_item_view, R.string.krabby_name, R.string.krabby_species,R.string.krabby_desc, R.string.krabby_weight, R.string.krabby_height, R.string.type_water, R.string.no_type_2
            ),
            DexEntry(
                R.string.kingler_dex_no, R.drawable.kingler_item_view, R.string.kingler_name, R.string.kingler_species,R.string.kingler_desc, R.string.kingler_weight, R.string.kingler_height, R.string.type_water, R.string.no_type_2
            ),

            /////////// 100 - 101
            DexEntry(
                R.string.voltorb_dex_no, R.drawable.voltorb_item_view, R.string.voltorb_name, R.string.voltorb_species,R.string.voltorb_desc, R.string.voltorb_weight, R.string.voltorb_height, R.string.type_electric, R.string.no_type_2
            ),
            DexEntry(
                R.string.electrode_dex_no, R.drawable.electrode_item_view, R.string.electrode_name, R.string.electrode_species,R.string.electrode_desc, R.string.electrode_weight, R.string.electrode_height, R.string.type_electric, R.string.no_type_2
            ),

            /////////// 102 - 103
            DexEntry(
                R.string.exeggcute_dex_no, R.drawable.exeggcute_item_view, R.string.exeggcute_name, R.string.exeggcute_species,R.string.exeggcute_desc, R.string.exeggcute_weight, R.string.exeggcute_height, R.string.type_grass, R.string.type_psychic
            ),
            DexEntry(
                R.string.exeggutor_dex_no, R.drawable.exeggutor_item_view, R.string.exeggutor_name, R.string.exeggutor_species,R.string.exeggutor_desc, R.string.exeggutor_weight, R.string.exeggutor_height, R.string.type_grass, R.string.type_psychic
            ),

            /////////// 104 - 105
            DexEntry(
                R.string.cubone_dex_no, R.drawable.cubone_item_view, R.string.cubone_name, R.string.cubone_species,R.string.cubone_desc, R.string.cubone_weight, R.string.cubone_height, R.string.type_ground, R.string.no_type_2
            ),
            DexEntry(
                R.string.marowak_dex_no, R.drawable.marowak_item_view, R.string.marowak_name, R.string.marowak_species,R.string.marowak_desc, R.string.marowak_weight, R.string.marowak_height, R.string.type_ground, R.string.no_type_2
            ),

            /////////// 106 - 107
            DexEntry(
                R.string.hitmonlee_dex_no, R.drawable.hitmonlee_item_view, R.string.hitmonlee_name, R.string.hitmonlee_species,R.string.hitmonlee_desc, R.string.hitmonlee_weight, R.string.hitmonlee_height, R.string.type_fighting, R.string.no_type_2
            ),
            DexEntry(
                R.string.hitmonchan_dex_no, R.drawable.hitmonchan_item_view, R.string.hitmonchan_name, R.string.hitmonchan_species,R.string.hitmonchan_desc, R.string.hitmonchan_weight, R.string.hitmonchan_height, R.string.type_fighting, R.string.no_type_2
            ),

            /////////// 108
            DexEntry(
                R.string.lickitung_dex_no, R.drawable.lickitung_item_view, R.string.lickitung_name, R.string.lickitung_species,R.string.lickitung_desc, R.string.lickitung_weight, R.string.lickitung_height, R.string.type_normal, R.string.no_type_2
            ),

            /////////// 109 - 110
            DexEntry(
                R.string.koffing_dex_no, R.drawable.koffing_item_view, R.string.koffing_name, R.string.koffing_species,R.string.koffing_desc, R.string.koffing_weight, R.string.koffing_height, R.string.type_poison, R.string.no_type_2
            ),
            DexEntry(
                R.string.weezing_dex_no, R.drawable.weezing_item_view, R.string.weezing_name, R.string.weezing_species,R.string.weezing_desc, R.string.weezing_weight, R.string.weezing_height, R.string.type_poison, R.string.no_type_2
            ),

            /////////// 111 - 112
            DexEntry(
                R.string.rhyhorn_dex_no, R.drawable.rhyhorn_item_view, R.string.rhyhorn_name, R.string.rhyhorn_species,R.string.rhyhorn_desc, R.string.rhyhorn_weight, R.string.rhyhorn_height, R.string.type_ground, R.string.type_rock
            ),
            DexEntry(
                R.string.rhydon_dex_no, R.drawable.rhydon_item_view, R.string.rhydon_name, R.string.rhydon_species,R.string.rhydon_desc, R.string.rhydon_weight, R.string.rhydon_height, R.string.type_ground, R.string.type_rock
            ),

            /////////// 113
            DexEntry(
                R.string.chansey_dex_no, R.drawable.chansey_item_view, R.string.chansey_name, R.string.chansey_species,R.string.chansey_desc, R.string.chansey_weight, R.string.chansey_height, R.string.type_normal, R.string.no_type_2
            ),

            /////////// 114
            DexEntry(
                R.string.tangela_dex_no, R.drawable.tangela_item_view, R.string.tangela_name, R.string.tangela_species,R.string.tangela_desc, R.string.tangela_weight, R.string.tangela_height, R.string.type_grass, R.string.no_type_2
            ),

            /////////// 115
            DexEntry(
                R.string.kangaskhan_dex_no, R.drawable.kangaskhan_item_view, R.string.kangaskhan_name, R.string.kangaskhan_species,R.string.kangaskhan_desc, R.string.kangaskhan_weight, R.string.kangaskhan_height, R.string.type_normal, R.string.no_type_2
            ),

            /////////// 116 - 117
            DexEntry(
                R.string.horsea_dex_no, R.drawable.horsea_item_view, R.string.horsea_name, R.string.horsea_species,R.string.horsea_desc, R.string.horsea_weight, R.string.horsea_height, R.string.type_water, R.string.no_type_2
            ),
            DexEntry(
                R.string.seadra_dex_no, R.drawable.seadra_item_view, R.string.seadra_name, R.string.seadra_species,R.string.seadra_desc, R.string.seadra_weight, R.string.seadra_height, R.string.type_water, R.string.no_type_2
            ),

            /////////// 118 - 119
            DexEntry(
                R.string.goldeen_dex_no, R.drawable.goldeen_item_view, R.string.goldeen_name, R.string.goldeen_species,R.string.goldeen_desc, R.string.goldeen_weight, R.string.goldeen_height, R.string.type_water, R.string.no_type_2
            ),
            DexEntry(
                R.string.seaking_dex_no, R.drawable.seaking_item_view, R.string.seaking_name, R.string.seaking_species,R.string.seaking_desc, R.string.seaking_weight, R.string.seaking_height, R.string.type_water, R.string.no_type_2
            ),

            /////////// 120 - 121
            DexEntry(
                R.string.staryu_dex_no, R.drawable.staryu_item_view, R.string.staryu_name, R.string.staryu_species,R.string.staryu_desc, R.string.staryu_weight, R.string.staryu_height, R.string.type_water, R.string.no_type_2
            ),
            DexEntry(
                R.string.starmie_dex_no, R.drawable.starmie_item_view, R.string.starmie_name, R.string.starmie_species,R.string.starmie_desc, R.string.starmie_weight, R.string.starmie_height, R.string.type_water, R.string.type_psychic
            ),

            /////////// 122
            DexEntry(
                R.string.mr_mime_dex_no, R.drawable.mr_mime_item_view, R.string.mr_mime_name, R.string.mr_mime_species,R.string.mr_mime_desc, R.string.mr_mime_weight, R.string.mr_mime_height, R.string.type_psychic, R.string.no_type_2
            ),

            /////////// 123
            DexEntry(
                R.string.scyther_dex_no, R.drawable.scyther_item_view, R.string.scyther_name, R.string.scyther_species,R.string.scyther_desc, R.string.scyther_weight, R.string.scyther_height, R.string.type_bug, R.string.type_flying
            ),

            /////////// 124
            DexEntry(
                R.string.jynx_dex_no, R.drawable.jynx_item_view, R.string.jynx_name, R.string.jynx_species,R.string.jynx_desc, R.string.jynx_weight, R.string.jynx_height, R.string.type_ice, R.string.type_psychic
            ),

            /////////// 125
            DexEntry(
                R.string.electabuzz_dex_no, R.drawable.electabuzz_item_view, R.string.electabuzz_name, R.string.electabuzz_species,R.string.electabuzz_desc, R.string.electabuzz_weight, R.string.electabuzz_height, R.string.type_electric, R.string.no_type_2
            ),

            /////////// 126
            DexEntry(
                R.string.magmar_dex_no, R.drawable.magmar_item_view, R.string.magmar_name, R.string.magmar_species,R.string.magmar_desc, R.string.magmar_weight, R.string.magmar_height, R.string.type_fire, R.string.no_type_2
            ),

            /////////// 127
            DexEntry(
                R.string.pinsir_dex_no, R.drawable.pinsir_item_view, R.string.pinsir_name, R.string.pinsir_species,R.string.pinsir_desc, R.string.pinsir_weight, R.string.pinsir_height, R.string.type_bug, R.string.no_type_2
            ),

            /////////// 128
            DexEntry(
                R.string.tauros_dex_no, R.drawable.tauros_item_view, R.string.tauros_name, R.string.tauros_species,R.string.tauros_desc, R.string.tauros_weight, R.string.tauros_height, R.string.type_normal, R.string.no_type_2
            ),

            /////////// 129 - 130
            DexEntry(
                R.string.magikarp_dex_no, R.drawable.magikarp_item_view, R.string.magikarp_name, R.string.magikarp_species,R.string.magikarp_desc, R.string.magikarp_weight, R.string.magikarp_height, R.string.type_water, R.string.no_type_2
            ),
            DexEntry(
                R.string.gyarados_dex_no, R.drawable.gyarados_item_view, R.string.gyarados_name, R.string.gyarados_species,R.string.gyarados_desc, R.string.gyarados_weight, R.string.gyarados_height, R.string.type_water, R.string.type_flying
            ),

            /////////// 131
            DexEntry(
                R.string.lapras_dex_no, R.drawable.lapras_item_view, R.string.lapras_name, R.string.lapras_species,R.string.lapras_desc, R.string.lapras_weight, R.string.lapras_height, R.string.type_water, R.string.type_ice
            ),

            /////////// 132
            DexEntry(
                R.string.ditto_dex_no, R.drawable.ditto_item_view, R.string.ditto_name, R.string.ditto_species,R.string.ditto_desc, R.string.ditto_weight, R.string.ditto_height, R.string.type_normal, R.string.no_type_2
            ),

            /////////// 133
            DexEntry(
                R.string.eevee_dex_no, R.drawable.eevee_item_view, R.string.eevee_name, R.string.eevee_species,R.string.eevee_desc, R.string.eevee_weight, R.string.eevee_height, R.string.type_normal, R.string.no_type_2
            ),

            /////////// 134
            DexEntry(
                R.string.vaporeon_dex_no, R.drawable.vaporeon_item_view, R.string.vaporeon_name, R.string.vaporeon_species,R.string.vaporeon_desc, R.string.vaporeon_weight, R.string.vaporeon_height, R.string.type_water, R.string.no_type_2
            ),

            /////////// 135
            DexEntry(
                R.string.jolteon_dex_no, R.drawable.jolteon_item_view, R.string.jolteon_name, R.string.jolteon_species,R.string.jolteon_desc, R.string.jolteon_weight, R.string.jolteon_height, R.string.type_electric, R.string.no_type_2
            ),

            /////////// 136
            DexEntry(
                R.string.flareon_dex_no, R.drawable.flareon_item_view, R.string.flareon_name, R.string.flareon_species,R.string.flareon_desc, R.string.flareon_weight, R.string.flareon_height, R.string.type_fire, R.string.no_type_2
            ),

            /////////// 137
            DexEntry(
                R.string.porygon_dex_no, R.drawable.porygon_item_view, R.string.porygon_name, R.string.porygon_species,R.string.porygon_desc, R.string.porygon_weight, R.string.porygon_height, R.string.type_normal, R.string.no_type_2
            ),

            /////////// 138 - 139
            DexEntry(
                R.string.omanyte_dex_no, R.drawable.omanyte_item_view, R.string.omanyte_name, R.string.omanyte_species,R.string.omanyte_desc, R.string.omanyte_weight, R.string.omanyte_height, R.string.type_rock, R.string.type_water
            ),
            DexEntry(
                R.string.omastar_dex_no, R.drawable.omastar_item_view, R.string.omastar_name, R.string.omastar_species,R.string.omastar_desc, R.string.omastar_weight, R.string.omastar_height, R.string.type_rock, R.string.type_water
            ),

            /////////// 140 - 141
            DexEntry(
                R.string.kabuto_dex_no, R.drawable.kabuto_item_view, R.string.kabuto_name, R.string.kabuto_species,R.string.kabuto_desc, R.string.kabuto_weight, R.string.kabuto_height, R.string.type_rock, R.string.type_water
            ),
            DexEntry(
                R.string.kabutops_dex_no, R.drawable.kabutops_item_view, R.string.kabutops_name, R.string.kabutops_species,R.string.kabutops_desc, R.string.kabutops_weight, R.string.kabutops_height, R.string.type_rock, R.string.type_water
            ),

            /////////// 142
            DexEntry(
                R.string.aerodactyl_dex_no, R.drawable.aerodactyl_item_view, R.string.aerodactyl_name, R.string.aerodactyl_species,R.string.aerodactyl_desc, R.string.aerodactyl_weight, R.string.aerodactyl_height, R.string.type_rock, R.string.type_flying
            ),

            /////////// 143
            DexEntry(
                R.string.snorlax_dex_no, R.drawable.snorlax_item_view, R.string.snorlax_name, R.string.snorlax_species,R.string.snorlax_desc, R.string.snorlax_weight, R.string.snorlax_height, R.string.type_normal, R.string.no_type_2
            ),

            /////////// 144
            DexEntry(
                R.string.articuno_dex_no, R.drawable.articuno_item_view, R.string.articuno_name, R.string.articuno_species,R.string.articuno_desc, R.string.articuno_weight, R.string.articuno_height, R.string.type_ice, R.string.type_flying
            ),

            /////////// 145
            DexEntry(
                R.string.zapdos_dex_no, R.drawable.zapdos_item_view, R.string.zapdos_name, R.string.zapdos_species,R.string.zapdos_desc, R.string.zapdos_weight, R.string.zapdos_height, R.string.type_electric, R.string.type_flying
            ),

            /////////// 146
            DexEntry(
                R.string.moltres_dex_no, R.drawable.moltres_item_view, R.string.moltres_name, R.string.moltres_species,R.string.moltres_desc, R.string.moltres_weight, R.string.moltres_height, R.string.type_fire, R.string.type_flying
            ),

            /////////// 147 - 149
            DexEntry(
                R.string.dratini_dex_no, R.drawable.dratini_item_view, R.string.dratini_name, R.string.dratini_species,R.string.dratini_desc, R.string.dratini_weight, R.string.dratini_height, R.string.type_dragon, R.string.no_type_2
            ),
            DexEntry(
                R.string.dragonair_dex_no, R.drawable.dragonair_item_view, R.string.dragonair_name, R.string.dragonair_species,R.string.dragonair_desc, R.string.dragonair_weight, R.string.dragonair_height, R.string.type_dragon, R.string.no_type_2
            ),
            DexEntry(
                R.string.dragonite_dex_no, R.drawable.dragonite_item_view, R.string.dragonite_name, R.string.dragonite_species,R.string.dragonite_desc, R.string.dragonite_weight, R.string.dragonite_height, R.string.type_dragon, R.string.type_flying
            ),

            /////////// 150 - 151
            DexEntry(
                R.string.mewtwo_dex_no, R.drawable.mewtwo_item_view, R.string.mewtwo_name, R.string.mewtwo_species,R.string.mewtwo_desc, R.string.mewtwo_weight, R.string.mewtwo_height, R.string.type_psychic, R.string.no_type_2
            ),
            DexEntry(
                R.string.mew_dex_no, R.drawable.mew_item_view, R.string.mew_name, R.string.mew_species,R.string.mew_desc, R.string.mew_weight, R.string.mew_height, R.string.type_psychic, R.string.no_type_2
            )
        )
    }
}