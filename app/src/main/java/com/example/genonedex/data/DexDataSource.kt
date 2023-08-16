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
            DexScrollEntry(R.string.golem_dex_no, R.drawable.golem_item_view, R.string.golem_name)
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
        )
    }
}